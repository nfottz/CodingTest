class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        answer[0] = (brown + 4 + (int)Math.sqrt(brown * brown - 8 * brown - 16 * yellow + 16)) / 4;
        answer[1] = (brown + 4 - (int)Math.sqrt(brown * brown - 8 * brown - 16 * yellow + 16)) / 4;
        return answer;
    }
}