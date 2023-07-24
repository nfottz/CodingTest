class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for(int i = 0; i < a-1; i++){
            days += month[i];
        }
        days += b;
        answer = day[days % 7];
        return answer;
    }
}