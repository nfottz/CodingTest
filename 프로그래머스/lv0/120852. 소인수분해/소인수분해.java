import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        Set<Integer> set = new HashSet<>();
	    List<Integer> list = new ArrayList<>();
	        
	    while(n != 1) {
	        for(int i = 2; i <= n; i++) {
	        	if(n % i == 0) {
	        		n /= i;
	        		set.add(i);
	        		i = 2;
	        		break;
	        	}
	        }
	    }

	    for(int i : set) {
	        list.add(i);
	    }
	        
	    Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}