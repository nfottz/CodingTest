import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nStr = n + "";
        int length = nStr.length();
        String[] arr = new String[length];
        for(int i = 0; i < length -1; i++){
            arr[i] = nStr.substring(i, i+1);
        }
        arr[length - 1] = nStr.substring(length-1);
        Arrays.sort(arr);
        String answerStr = "";
        for(int i = length -1; i>= 0; i--){
            answerStr += arr[i];
        }
        answer = Long.parseLong(answerStr);
        return answer;
    }
}