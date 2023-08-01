import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            Integer[] temp = new Integer[i + 1];
            for(int j = 0; j <= i; j++){
                temp[j] = score[j];
            }
            if(i < k) {
                Arrays.sort(temp,Collections.reverseOrder());
                answer[i] = temp[temp.length - 1];
            } else {
                Arrays.sort(temp,Collections.reverseOrder());
                answer[i] = temp[k - 1];
            }
        }
        return answer;
    }
}