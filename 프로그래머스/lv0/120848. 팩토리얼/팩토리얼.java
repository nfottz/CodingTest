class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;
        
        while(factorial <= n){
            factorial *= ++answer;
            if(factorial > n) answer--;
        }
        
        return answer;
    }
}