class Solution {
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    
    public int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        answer[0] = gcd(a, b);
        answer[1] = lcm(a, b);
        return answer;
    }
}