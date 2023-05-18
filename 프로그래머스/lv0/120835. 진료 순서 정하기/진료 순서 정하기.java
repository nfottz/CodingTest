import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        Integer[] emergencySort = new Integer[length];
        for(int i = 0; i < length; i++){
            emergencySort[i] = emergency[i];
        }
        Arrays.sort(emergencySort, Collections.reverseOrder());
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(emergency[i]==emergencySort[j]){
                    answer[i] = j+1; 
                }
            }
        }
        return answer;
    }
}