import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0, length = tangerine.length; i < length; i++){
            set.add(tangerine[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : set){
            map.put(i, 0);
        }
        
        for(int i = 0, length = tangerine.length; i < length; i++){
            int temp = tangerine[i];
            map.put(temp, map.get(temp) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int count = 0;
        for(int i = 0, size = list.size(); i < size; i++){
            if(count < k) {
                count += list.get(i).getValue();
                answer++;
            }
        }
        
        return answer;
    }
}