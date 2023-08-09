import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        Set<Integer> lottoSet = new HashSet<>();
        Set<Integer> winSet = new HashSet<>();
        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0) count++;
            lottoSet.add(lottos[i]);
            winSet.add(win_nums[i]);
        }
        lottoSet.retainAll(winSet);
        int size = lottoSet.size();
        int min = 7 - lottoSet.size();
        int max = 7 - (size + count);
        
        if(min > 6) min = 6;
        if(max > 6) max = 6;
        
        answer[0] = max;
        answer[1] = min;
        
        
        return answer;
    }
}