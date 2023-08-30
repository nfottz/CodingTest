import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0, length = progresses.length; i < length; i++){
            int days = (100 - progresses[i]) % speeds[i] == 0? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            q.offer(days);
        }
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int temp = q.poll();
        while(q.isEmpty() == false){
            if(q.peek() <= temp) {
                count++;
                q.poll();
            }
            else {
                list.add(count);
                temp = q.poll();
                count = 1;
            }
            if(q.isEmpty()) list.add(count);
        }
        int[] answer = new int[list.size()];
        for(int i = 0, length = list.size(); i < length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}