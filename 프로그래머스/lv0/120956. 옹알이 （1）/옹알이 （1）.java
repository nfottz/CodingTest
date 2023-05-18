class Solution {
    public int solution(String[] babbling) {

        int answer = 0;
        String[] poss = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < poss.length; j++){
                babbling[i] = babbling[i].replace(poss[j], " ");
            }
            if(babbling[i].isBlank()) answer++;
        }
        return answer;
    }
}