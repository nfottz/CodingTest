import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            char ch = (char)(i + 97);
            if(skip.contains(ch + "")) continue;
            list.add(ch);
        }
        int size = list.size();
        for(int i = 0, length = s.length(); i < length; i++){
            answer += list.get((list.indexOf(s.charAt(i)) + index) % size);
        }
        
        return answer;
    }
}