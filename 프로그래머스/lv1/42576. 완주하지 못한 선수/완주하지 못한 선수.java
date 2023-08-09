import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0, length = participant.length; i < length; i++){
            if(map.get(participant[i]) == null){
                map.put(participant[i], 1);
            } else {
                map.put(participant[i], map.get(participant[i]) + 1);
            }
        }
        
        for(int i = 0, length = completion.length; i < length; i++){
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}