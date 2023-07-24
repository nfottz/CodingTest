import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        List<String> numList = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < number.length; j++){
                if((my_string.charAt(i)+"").equals(number[j])){
                    numList.add(my_string.charAt(i)+"");
                }
            }
        }
        int[] answer = new int[numList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(numList.get(i));
        }
        
        Arrays.sort(answer);
        return answer;
    }
}