import java.util.*;

class Solution {
    public int solution(String dartResult) {

        String[] bonus = new String[3];
        int j = 0;
        for(int i = 0, length = dartResult.length(); i < length; i++){
            String s = dartResult.substring(i, i + 1);
            if(s.equals("S") || s.equals("D") || s.equals("T")){
                bonus[j] = s;
                dartResult = dartResult.replaceFirst(s, " ");
                j++;
            }
        }
        String[] temp = dartResult.split(" ");
        String[] option = new String[3];
        for(int i = 1, length = temp.length; i < length; i++){
            if(temp[i].contains("*")) {
                option[i - 1] = "*";
                temp[i] = temp[i].replace("*", "");
            } else if(temp[i].contains("#")) {
                option[i - 1] = "#";
                temp[i] = temp[i].replace("#", "");
            }
        }
        int[] scores = new int[3];
        for(int i = 0; i < 3; i++){
            scores[i] = Integer.parseInt(temp[i]);
            switch(bonus[i]){
                case "D" : scores[i] = scores[i] * scores[i]; break;
                case "T" : scores[i] = scores[i] * scores[i] * scores[i]; break;
            }
            if(option[i] != null){
                if(option[i].equals("*")){
                    scores[i] *= 2;
                    if(i != 0) scores[i - 1] *= 2;
                } else if(option[i].equals("#")){
                    scores[i] *= -1;
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < 3; i++){
            answer += scores[i];
        }
        return answer;
    }
}