import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String[][] pad = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0" , "#"}};
        
        StringBuilder sb = new StringBuilder();
        Map<String, Object> map = new HashMap<>();
        map.put("L", "*");
        map.put("R", "#");
        for(int i = 0, length = numbers.length; i < length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                map.put("L", numbers[i]);
                sb.append("L");
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                map.put("R", numbers[i]);
                sb.append("R");
            } else {
                int x0 = 0, xL = 0, xR = 0, y0 = 0, yL = 0, yR = 0;
                for(int j = 0; j < 4; j++){
                    for(int k = 0; k < 3; k++){
                        if((numbers[i] + "").equals(pad[j][k])){
                            x0 = k;
                            y0 = j;
                        }
                        if((map.get("L") + "").equals(pad[j][k])){
                            xL = k;
                            yL = j;
                        }
                        if((map.get("R") + "").equals(pad[j][k])){
                            xR = k;
                            yR = j;
                        }
                    }
                }
                int disL = Math.abs(xL - x0) + Math.abs(yL - y0);
                int disR = Math.abs(xR - x0) + Math.abs(yR - y0);
                if(disL < disR) {
                    map.put("L", numbers[i]);
                    sb.append("L");
                } else if(disL > disR){
                    map.put("R", numbers[i]);
                    sb.append("R");
                } else{
                    if(hand.equals("right")){
                        map.put("R", numbers[i]);
                        sb.append("R");
                    } else{
                        map.put("L", numbers[i]);
                        sb.append("L");
                    }
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}