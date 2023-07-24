import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        for(int i = 0, length = arr.length; i < length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        int size = list.size();
        if(size != 0) {
            answer = new int[size];
            for(int i = 0; i < size; i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }

        return answer;
    }
}