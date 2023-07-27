import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(i == j) continue;
                else set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] answerInt = set.toArray(new Integer[0]);
        int[] answer = new int[answerInt.length];
        for(int i = 0; i < answerInt.length; i++){
            answer[i] = answerInt[i];
        }
        Arrays.sort(answer);
        
        return answer;
    }
}