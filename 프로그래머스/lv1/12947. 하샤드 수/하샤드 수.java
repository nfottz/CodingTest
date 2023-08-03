class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int temp = x;
        while(temp >= 10){
            sum += temp % 10;
            temp /= 10;
        }
        sum += temp;
        if(x % sum == 0) answer = true;
        return answer;
    }
}