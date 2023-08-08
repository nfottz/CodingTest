class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] cloth = new int[n];
        for(int i = 0; i < n; i++){
            cloth[i] = 1;
        }
        for(int i = 0; i < lost.length; i++){
            cloth[lost[i] - 1] --;
        }
        for(int i = 0; i < reserve.length; i++){
            cloth[reserve[i] - 1] ++;
        }
        if(cloth[0] == 2 && cloth[1] == 0){
            cloth[0] = 1; cloth[1] = 1;
        }
        for(int i = 1; i < n - 1; i++){
            if(cloth[i] == 2 && cloth[i - 1] == 0){
                cloth[i] = 1; cloth[i - 1] = 1;
            } else if(cloth[i] == 2 && cloth[i + 1] == 0){
                cloth[i] = 1; cloth[i + 1] = 1;
            }
        }
        
        if(cloth[n - 1] == 2 && cloth[n - 2] == 0){
            cloth[n - 1] = 1; cloth[n - 2] = 1;
        }
        
        for(int i = 0; i < n; i++){
            if(cloth[i] == 1 || cloth[i] == 2) answer ++;
        }
        return answer;
    }
}