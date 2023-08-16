class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        
        for(int i = 0; i < park.length; i++){
            if(park[i].contains("S")){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }

        int wMax = park[0].length() - 1;
        int hMax = park.length - 1;

        for(int i = 0, length = routes.length; i < length; i++){
            String op = routes[i].split(" ")[0];
            int n = Integer.parseInt(routes[i].split(" ")[1]);
            
            switch(op){
                case "E": if(answer[1] + n <= wMax){
                    int temp = answer[1];
                    for(int j = 0; j < n; j++){
                        temp++;
                        if(park[answer[0]].substring(temp, temp + 1).equals("X")) {
                            temp--; break;
                        }
                    }
                    if(temp == answer[1] + n) answer[1] = temp;
                } break;
                case "W": if(answer[1] - n >= 0){
                    int temp = answer[1];
                    for(int j = 0; j < n; j++){
                        temp--;
                        if(park[answer[0]].substring(temp, temp + 1).equals("X")) {
                            temp++; break;
                        }
                    }
                    if(temp == answer[1] - n) answer[1] = temp;
                } break;
                case "N": if(answer[0] - n >= 0){
                    int temp = answer[0];
                    for(int j = 0; j < n; j++){
                        temp--;
                        if(park[temp].substring(answer[1], answer[1] + 1).equals("X")) {
                            temp++; break;
                        }
                    }
                    if(temp == answer[0] - n) answer[0] = temp;
                } break;
                case "S": if(answer[0] + n <= hMax){
                    int temp = answer[0];
                    for(int j = 0; j < n; j++){
                        temp++;
                        if(park[temp].substring(answer[1], answer[1] + 1).equals("X")) {
                            temp--; break;
                        }
                    }
                    if(temp == answer[0] + n) answer[0] = temp;
                } break;
            }
        }
        
        return answer;
    }
}