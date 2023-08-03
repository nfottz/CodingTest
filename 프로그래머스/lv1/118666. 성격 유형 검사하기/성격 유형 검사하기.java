class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] type = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] count = new int[8];
        for(int i = 0; i < survey.length; i++){
            for(int j = 0; j < 8; j++){
                if(choices[i] < 4){
                    if(type[j].equals(survey[i].substring(0, 1))) count[j] += 4 - choices[i];
                } else if(choices[i] > 4){
                    if(type[j].equals(survey[i].substring(1, 2))) count[j] += choices[i] - 4;
                }
            }
        }
        if(count[0] >= count[1]) answer += type[0];
        else answer += type[1];
        if(count[2] >= count[3]) answer += type[2];
        else answer += type[3];
        if(count[4] >= count[5]) answer += type[4];
        else answer += type[5];
        if(count[6] >= count[7]) answer += type[6];
        else answer += type[7];
        return answer;
    }
}