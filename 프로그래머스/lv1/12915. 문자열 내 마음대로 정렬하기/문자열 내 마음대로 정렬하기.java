import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0, length = strings.length; i < length; i++){
            map.put(i, strings[i].substring(n, n + 1));
        }
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for(int i = 0, size = list.size(); i < size; i++){
            answer[i] = strings[list.get(i).getKey()];
        }
        
        return answer;
    }
}