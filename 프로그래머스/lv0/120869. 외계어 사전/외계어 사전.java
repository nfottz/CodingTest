class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            int[] count = new int[spell.length];
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])) count[j] ++;
                dic[i] = dic[i].replace(spell[j], " ");
            }
            if(dic[i].isBlank()){
                for(int k = 0; k < count.length; k++){
                    if(count[k] == 0){
                        answer = 2; break;
                    } else {
                        answer = 1;
                    }
                }
                if(answer == 1) return answer;
            }
        }
        return answer;
    }
}