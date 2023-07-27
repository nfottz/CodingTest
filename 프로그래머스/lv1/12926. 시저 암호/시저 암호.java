class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int length = s.length();
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(c != 32) {
                int a = c + n;
                if(c < 97){
                    while(a > 90){
                        a -= 26;
                    }
                } if(c >= 97){
                    while(a > 122){
                        a -= 26;
                    }
                }
                answer += (char)a;
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}