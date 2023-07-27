import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        int maxWidth = 0;
        int maxHeight = 0;
        for(int i = 0; i < sizes.length; i++){
            if(maxWidth < sizes[i][0]) maxWidth = sizes[i][0];
            if(maxHeight < sizes[i][1]) maxHeight = sizes[i][1];
        }
        answer = maxWidth * maxHeight;
        return answer;
    }
}