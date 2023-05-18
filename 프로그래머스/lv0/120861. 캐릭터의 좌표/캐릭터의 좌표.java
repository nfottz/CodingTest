class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0; int y = 0;
		for(int i = 0; i < keyinput.length; i++) {
			switch(keyinput[i]) {
			case "left":
				if(x - 1 >= board[0] / (-2)) x -= 1; break;
			case "right":
				if(x + 1 <= board[0] / 2) x += 1; break;
			case "up":
				if(y + 1 <= board[1] / 2) y += 1; break;
			case "down":
				if(y - 1 >= board[1] / (-2)) y -= 1; break;
			}			
		}
        int[] answer = {x, y};
        return answer;
    }
}