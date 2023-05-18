class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = 0;
        int min = Integer.MIN_VALUE;
        for(int i = min; i < 100; i++){
            sum = num * (num + 2*i -1) / 2;
            if(sum == total){
                for(int j = 0; j < answer.length; j++){
                    answer[j] = i++;
                }
            }
        }
                
        return answer;
    }
}