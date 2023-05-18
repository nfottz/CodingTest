class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int count = 0;
        int[] num = new int[numlist.length];
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                num[i] = numlist[i];
                count ++;
            } else {
                num[i] = 0;
            }
        }
        int[] answer = new int[count];
        
        int j = 0;
        for(int i = 0; i < numlist.length; i++){
            if(num[i] != 0){
                answer[j++] = num[i];
            }
        }
        return answer;
    }
}