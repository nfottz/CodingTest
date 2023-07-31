class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i < s.length(); i++){
            int temp = -1;
            for(int j = 0; j < i; j++){
                if(i == j) continue;
                else {
                    if(s.charAt(j) == s.charAt(i)){
                        temp = (i - j);
                    }
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}