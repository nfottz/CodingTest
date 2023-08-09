import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int total = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < total; i++){
            set.add(nums[i]);
        }
        int setSize = set.size();
        int answer = total / 2 >= setSize? setSize : total / 2;
        
        return answer;
    }
}