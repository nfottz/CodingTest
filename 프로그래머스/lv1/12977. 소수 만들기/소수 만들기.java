import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 3000 이하의 소수 찾기
        boolean[] prime = new boolean[3001];
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < 3001; i++){
            prime[i] = true;
        }
        for(int i = 2; i * i <= 3000; i++){
            if(prime[i]){
                for(int j = i * i; j <= 3000; j += i){
                    prime[j] = false;
                }
            }
        }
        
        // 3개 골라서 더하기
        int length = nums.length;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                for(int k = j + 1; k < length; k++){
                    if(prime[nums[i] + nums[j] + nums[k]]) answer ++;
                }
            }
        }
        
        return answer;
    }
}