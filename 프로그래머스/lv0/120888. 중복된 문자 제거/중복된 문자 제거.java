class Solution {
    public String solution(String my_string) {
        String answer = my_string.charAt(0)+"";

        for(int i = 1; i < my_string.length(); i++){
            if(answer.contains((my_string.charAt(i)+""))){
                answer += "";
            } else {
                answer += my_string.charAt(i)+"";
            }
            
            
        }
        
        return answer;
    }
}