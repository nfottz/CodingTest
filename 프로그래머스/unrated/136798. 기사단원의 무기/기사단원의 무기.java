class Solution {
    
    public int countDiv(int n){
        int count =0;
        for(int i = 1; i * i <= n; i++){
            if(i * i == n) count++;
            else if(n % i == 0) count += 2;
        }
        return count;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] attack = new int[number];
        for(int i = 0; i < number; i++){
            attack[i] = countDiv(i + 1);
        }
        for(int i = 0; i < number; i++){
            if(attack[i] > limit) attack[i] = power;
        }
        for(int i = 0; i < number; i++){
            answer += attack[i];
        }
        return answer;
    }
}