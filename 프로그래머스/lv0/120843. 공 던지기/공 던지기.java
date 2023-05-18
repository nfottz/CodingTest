class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int length = numbers.length;
        int idx = 2 * (k - 1);
        
        while(idx > length) idx -= length;
        
        answer = numbers[idx];
        return answer;
    }
}