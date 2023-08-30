class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0, length = prices.length; i < length - 1; i++){
            int j = i + 1;
            answer[i]++;
            while(prices[i] <= prices[j] && j < length - 1){
                j++;
                answer[i]++;
            }
        }
        return answer;
    }
}