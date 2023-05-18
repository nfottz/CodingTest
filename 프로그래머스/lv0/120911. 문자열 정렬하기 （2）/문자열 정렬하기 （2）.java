import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String myString = my_string.toLowerCase();
        
        String[] answerArr = new String[myString.length()];
        for(int i = 0; i < myString.length(); i++){
            answerArr[i] = myString.charAt(i)+"";
        }
        
        Arrays.sort(answerArr);
        
        for(int i = 0; i < answerArr.length; i++){
            answer += answerArr[i];
        }
        
        return answer;
    }
}