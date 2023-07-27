class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answerTemp = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] == 1) continue;
            else {
                for(int j = 0; j < food[i] / 2; j++){
                    answerTemp += i + "";
                }
            }
        }
        answer += answerTemp + 0;
        int length = answerTemp.length();
        for(int i = 0; i < length; i++){
            answer += answerTemp.substring(length - 1 - i, length - i);
        }
        
        return answer;
    }
}