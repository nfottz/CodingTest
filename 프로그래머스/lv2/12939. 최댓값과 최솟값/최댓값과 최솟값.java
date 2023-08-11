import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int length = arr.length;
        int max = Integer.parseInt(arr[0]);
        int min = max;
        for(int i = 1; i < length; i++){
            max = Math.max(max, Integer.parseInt(arr[i]));
            min = Math.min(min, Integer.parseInt(arr[i]));
        }
        answer = min + " " + max;
        return answer;
    }
}