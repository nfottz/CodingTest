import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int n : set) {
            list.add(n);
        }
        
        int[] count = new int[list.size()];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(array[i] == list.get(j)) count[j]++;
            }
        }
        
        int max = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > max) {
                max = count[i];
                answer = list.get(i);
            }
        }
        
        int con = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == max) con++;
        }
        
        if(con >= 2) answer = -1;
        
        return answer;
    }
}