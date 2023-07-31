class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num == 1) {
            answer = 0;
        } else {
            long numL = num;
            while(numL != 1 && answer <= 500){
                if(numL % 2 == 0) numL /= 2;
                else numL = numL * 3 + 1;
                answer ++;
            }
            num = (int)numL;
        }
        if(num != 1 || answer > 500) answer = -1;
        return answer;
    }
}