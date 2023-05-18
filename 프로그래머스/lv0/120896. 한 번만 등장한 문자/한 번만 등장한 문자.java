import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        
        List<Character> list = new ArrayList<>();
        for(char c : set){
            list.add(c);
        }
        
        int[] count = new int[list.size()];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < list.size(); j++){
                if(s.charAt(i) == list.get(j)) count[j]++;
            }
        }
        
        List<Character> answerList = new ArrayList<>();
        for(int i = 0; i < count.length; i++){
            if(count[i] == 1){
                answerList.add(list.get(i));
            }
        }
        
        char[] answerArr = new char[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answerArr[i] = answerList.get(i);
        }

        if(answerArr.length == 0) answer = "";
        else {
            Arrays.sort(answerArr);
            for(int i = 0; i < answerArr.length; i++){
                answer += answerArr[i]+"";
            }
        }
        
        return answer;
    }
}