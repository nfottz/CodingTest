import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] abs = new int[array.length];
        for(int i = 0; i < array.length; i++){
            abs[i] = Math.abs(array[i] - n);
        }
        
        int min = 100;
        for(int i = 0; i < array.length; i++){
            if(abs[i] < min) min = abs[i];
        }
        
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(abs[i] == min) {
                answer = array[i];
                break;
            }
        }
        
        return answer;
    }
}