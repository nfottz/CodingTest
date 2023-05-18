class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int r = 0;
        if(common[1]*common[1] == common[0]*common[2]){
            for(int i = 0; i < common.length; i++){
                if(common[i] != 0 && common[i+1] !=0){
                    r = common[i+1] / common[i];
                    break;
                }
            }
            answer = common[common.length-1] * r;
        } 
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length-1] + (common[1] - common[0]);
        }
        return answer;
    }
}