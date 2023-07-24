class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = Integer.toString(n, 3);
        String ansStr = "";
        for(int i = three.length() - 1; i >= 0; i--){
            ansStr += three.substring(i, i+1);
        }
        answer = Integer.parseInt(ansStr, 3);
        return answer;
    }
}