class Solution {
    public int[] solution(long n) {
        String nStr = n+"";
        int length = nStr.length();
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = Integer.parseInt(nStr.charAt(length - i - 1)+"");
        }
        return answer;
    }
}