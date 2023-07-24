class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0, length = my_string.length(); i < length; i++){
            answer += my_string.substring(length-1-i, length-i);
        }
        
        return answer;
    }
}