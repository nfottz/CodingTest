class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0, length = num_list.length; i < length; i++){
            answer[i] = num_list[length - 1 - i];
        }
        
        return answer;
    }
}