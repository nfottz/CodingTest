class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0, length = s.length(); i < length; i++){
            char ch = s.charAt(i);
            int isX = 1, notX = 0;
            try {
                while(isX != notX){
                    char ch2 = s.charAt(++i);
                    if(ch == ch2) isX++;
                    else notX++;
                }
            } catch(Exception e){
            } finally{
                answer++;
            }
        }
        return answer;
    }
}