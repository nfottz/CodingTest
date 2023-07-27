import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] pOne = {1, 2, 3, 4, 5};
        int[] pTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int one = 0, two = 0, three = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == pOne[i % pOne.length]) one ++;
            if(answers[i] == pTwo[i % pTwo.length]) two ++;
            if(answers[i] == pThree[i % pThree.length]) three ++;
        }
        int max = Math.max(one, Math.max(two, three));
        List<Integer> list = new ArrayList<>();
        if(one == max) list.add(1);
        if(two == max) list.add(2);
        if(three == max) list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}