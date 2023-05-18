class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String ageStr = age+"";
        
        for(int i = 0; i < ageStr.length(); i++){
            answer += str[Integer.parseInt(ageStr.charAt(i)+"")];
        }
        
        return answer;
    }
}