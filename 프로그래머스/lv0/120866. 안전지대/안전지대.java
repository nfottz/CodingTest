import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = 0;
        int[][] count = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int a = i == 0? 0 : i - 1;
                int b = j == 0? 0 : j - 1;
                int c = i == n - 1? n - 1 : i + 1;
                int d = j == n - 1? n - 1 : j + 1;
                if(board[i][j] == 1){
                    count[i][j] = 5;
                    count[a][b] = 5;
                    count[a][j] = 5;
                    count[a][d] = 5;
                    count[i][b] = 5;
                    count[i][d] = 5;
                    count[c][b] = 5;
                    count[c][j] = 5;
                    count[c][d] = 5;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(count[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}