class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] poss = {"aya", "ye", "woo", "ma"};
        for(int i = 0, length = babbling.length; i < length; i++){
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) continue;
            else {
                for(int j = 0; j < 4; j++){
                    babbling[i] = babbling[i].replace(poss[j], " ");
                }
                if(babbling[i].isBlank()) answer++;
            }
        }
        return answer;
    }
}