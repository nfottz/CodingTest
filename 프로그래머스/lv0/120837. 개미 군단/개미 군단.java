class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp >= 5){
            answer ++;
            hp -= 5;
        }
        while(hp >= 3){
            answer ++;
            hp -= 3;
        }
        
        answer += hp;
        
        return answer;
    }
}