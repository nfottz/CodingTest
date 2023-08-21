class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(s.equals("1") == false){
            int before = s.length();
            s = s.replace("0", "");
            int after = s.length();
            s = Integer.toString(after, 2);
            answer[0]++;
            answer[1] += before - after;
        }
        return answer;
    }
}