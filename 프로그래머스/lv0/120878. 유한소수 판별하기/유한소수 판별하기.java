// import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        int gcd = 0;
        if(a > b){
            for(int n = 1; n <= b; n++){
                if(a % n == 0 && b % n == 0) gcd = n;
            }
        } else {
            for(int n = 1; n <= a; n++){
                if(a % n == 0 && b % n == 0) gcd = n;
            }
        }

        int denom = b / gcd;

        while(denom % 2 == 0){
            denom /= 2;
        }
        while(denom % 5 == 0){
            denom /= 5;
        }
        
        int answer = 1;
        if(denom != 1) answer = 2;
        
        return answer;
    }
}