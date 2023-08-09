import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length;
        Integer[] arr = new Integer[length];
        for(int i = 0; i < length; i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < length - length % m; i += m){
            int price = (int)arr[i + m - 1] * m;
            answer += price;
        }
        return answer;
    }
}