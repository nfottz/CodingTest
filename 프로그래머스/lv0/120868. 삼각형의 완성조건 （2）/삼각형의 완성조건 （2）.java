import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        
        int answer = 2 * sides[0] - 1;
            
        return answer;
    }
}