import java.util.*;

public class Solution {
    public int[] solution(int []arr) {        
        Stack<Integer> st = new Stack<>();
        for(int i = 0, length = arr.length; i < length; i++){
            if(st.isEmpty() || st.peek() != arr[i]) st.push(arr[i]);
        }
        int size = st.size();
        int[] answer = new int[size];
        for(int i = size - 1; i >= 0; i--){
            answer[i] = st.pop();
        }
        return answer;
    }
}