import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 1; i <= N; i++){
            double a = 0; double b = 0;
            for(int j = 0, length = stages.length; j < length; j++){
                if(stages[j] >= i) a++;
                if(stages[j] == i) b++;
            }
            if(a == 0) map.put(i, (double)0);
            else {
                map.put(i, b/a);
            }
        }
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(int i = 0, size = list.size(); i < size; i++){
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}