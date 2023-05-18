class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] quizStr = quiz[i].split(" ");
            int a = Integer.parseInt(quizStr[0]);
            String op = quizStr[1];
            int b = Integer.parseInt(quizStr[2]);
            int ans = Integer.parseInt(quizStr[4]);
            
            if(op.equals("+")){
                if(ans == a + b) answer[i] = "O";
                else answer[i] = "X";
            }
            if(op.equals("-")){
                if(ans == a - b) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        
        return answer;
    }
}