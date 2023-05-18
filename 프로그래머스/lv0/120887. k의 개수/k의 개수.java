class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = k +"";

        for(int a = i; a <= j; a++){
            String aStr = a + "";
            for(int b = 0; b < aStr.length(); b++){
                if((aStr.charAt(b)+"").equals(kStr)) answer++;
            }
        }
        
        return answer;
    }
}