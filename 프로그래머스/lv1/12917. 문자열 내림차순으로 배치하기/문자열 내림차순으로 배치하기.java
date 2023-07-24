import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length();
        String[] arr = new String[sLength];
        for(int i = 0; i < sLength; i++){
            arr[i] = s.substring(i, i+1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        List<String> upper = new ArrayList<>();
        List<String> lower = new ArrayList<>();
        for(int i = 0, length = arr.length; i < length; i++){
            if(arr[i].charAt(0) < 97) upper.add(arr[i]);
            else lower.add(arr[i]);
        }
        for(int i = 0, size = lower.size(); i < size; i++){
            answer += lower.get(i);
        }
        for(int i = 0, size = upper.size(); i < size; i++){
            answer += upper.get(i);
        }
        
        return answer;
    }
}