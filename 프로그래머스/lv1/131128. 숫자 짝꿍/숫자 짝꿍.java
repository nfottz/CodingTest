import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] countX = new int[10];
        int[] countY = new int[10];
        for(int i = 0, length = X.length(); i < length; i++){
            int tempX = Integer.parseInt(X.charAt(i) + "");
            countX[tempX] ++;
        }
        for(int i = 0, length = Y.length(); i < length; i++){
            int tempY = Integer.parseInt(Y.charAt(i) + "");
            countY[tempY] ++;
        }
        
        int[] count = new int[10];
        for(int i = 0; i < 10; i++){
            count[i] = Math.min(countX[i], countY[i]);
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < count[i]; j++){
                sb.append(i);
            }
        }
        answer = sb.toString();
        if(answer.startsWith("0")) answer = "0";
        if(answer.isBlank()) answer = "-1";
        
        return answer;
    }
}