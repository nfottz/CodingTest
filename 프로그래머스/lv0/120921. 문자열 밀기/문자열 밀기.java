class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int length = A.length();
        for(int i = 0; i < length; i++){
            if(A.equals(B)){
                return answer;
            } else {
                A = A.charAt(length - 1) + A.substring(0, length - 1);
                answer ++;
            }
        }
        if(answer == length) answer = -1;
        
        return answer;
    }
}