import java.util.ArrayList;
import java.util.List;

class Solution {
	    public int[] solution(int n) {
	        int[] num = new int[n];
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i = 0; i < n; i++){
	            if(n % (i + 1) == 0){
	            	list.add(i+1);
	            }
	        }
	        int[] answer = new int[list.size()];
	        for(int i = 0; i < answer.length; i++) {
	        	answer[i] = list.get(i);
	        }
	        return answer;
	    }
}