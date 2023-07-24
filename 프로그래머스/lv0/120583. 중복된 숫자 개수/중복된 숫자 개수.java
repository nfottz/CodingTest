class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0, length = array.length; i < length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}