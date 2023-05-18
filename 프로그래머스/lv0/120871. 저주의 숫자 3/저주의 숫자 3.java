class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i = 1; i <= n + count; i++){
            if(i % 3 == 0) count++;
            if(i % 3 != 0 && (i+"").contains("3")) count++;   
        }
        
        answer = n + count;
        
        return answer;
    }
}