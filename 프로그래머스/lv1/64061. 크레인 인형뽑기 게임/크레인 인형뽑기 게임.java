import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0, length = moves.length; i < length; i++){
            for(int j = 0, size = board.length; j < size; j++){
                if(board[j][moves[i] - 1] != 0){
                    list.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
            if(list.size() >=2) {
                if(list.get(list.size() - 1) == list.get(list.size() - 2)) {
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                    answer += 2;
                }
            }
        }
        
        return answer;
    }
}