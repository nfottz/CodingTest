class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0, length = array.length; i < length; i++){
            if(array[i] > height){
                answer++;
            }
        }
        
        return answer;
    }
}