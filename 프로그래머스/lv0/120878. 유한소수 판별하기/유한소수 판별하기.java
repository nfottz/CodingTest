import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        // 최대공약수 구하기
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
        
        // 기약분수의 분모 구하기
        double denom = b / gcd;
        
        // 1000 이하의 소수 구하기
        List<Integer> prime = new ArrayList<>();
        for(int x = 2; x <= 1000; x++){
            int count = 0;
            for(int y = 1; y <= 1000; y++){
                if(x % y == 0) count++;
            }
            if(count == 2) prime.add(x);
        }
        
        int answer = 0;
        for(int i = 0; i < prime.size(); i++){
            if(i == 0 || i == 2){
                continue;
            } else {
                if(denom % prime.get(i) == 0){
                    answer = 2; return answer;
                }
            } answer = 1;
        }
        if(denom == 1) answer = 1;
        
        return answer;
    }
}