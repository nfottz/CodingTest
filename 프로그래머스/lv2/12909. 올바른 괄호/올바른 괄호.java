import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0, length = s.length(); i < length; i++){
            char ch = s.charAt(i);
            if(st.isEmpty() && ch == ')') return false;
            else {
                if(ch == '(') st.push(ch);
                else st.pop();
            }
        }
        boolean answer = st.isEmpty();
        return answer;
    }
}