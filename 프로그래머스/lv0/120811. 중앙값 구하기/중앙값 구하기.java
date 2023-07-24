import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int i = array.length / 2 + 1;
        
        answer = array[i-1];
        
        return answer;
    }
}