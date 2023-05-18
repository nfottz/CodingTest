class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numStr = num + "";
        String kStr = k + "";
        
        for(int i = 0, length = numStr.length(); i < length; i++){
            if((numStr.charAt(i)+"").equals(kStr)){
                answer = (i + 1); break;
            } answer = -1;
        }
        
        return answer;
    }
}