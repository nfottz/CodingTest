import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int[] answer = new int[length == 1? 1 : length-1];
        if(length == 1) {
            answer[0] = -1;
        }
        else {
            int[] arrTemp = new int[length];
            for(int i = 0; i < length; i++){
                arrTemp[i] = arr[i];
            }
            Arrays.sort(arrTemp);
            int remove = arrTemp[0];
            int count = 0;
            for(int i = 0; i < length; i++){
                if(arr[i] == remove){
                    count++; continue;
                } else {
                    answer[i - count] = arr[i];
                }
            }
        }
        return answer;
    }
}