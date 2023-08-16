import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            temp = temp.toLowerCase();
            answer += temp.substring(0, 1).toUpperCase() + temp.substring(1);
        }
        return answer;
    }
}