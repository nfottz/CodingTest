class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0, length = numbers.length; i < length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}