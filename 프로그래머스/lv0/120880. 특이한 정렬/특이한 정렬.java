import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        int[] answer = new int[length];
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] numInt = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(numInt, Collections.reverseOrder());
        for(int i = 0; i < length; i ++){
            map.put(i, Math.abs(numInt[i] - n));
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
        for(int i = 0, size = list.size(); i < size; i++){
            answer[i] = numInt[list.get(i).getKey()];
        }
        return answer;
    }
}