import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            for(int i = 0, length = token.length(); i < length; i++){
                if(i % 2 == 0) answer += token.substring(i, i+1).toUpperCase();
                else answer += token.substring(i, i+1).toLowerCase();
            }
        }
        return answer;
    }
}