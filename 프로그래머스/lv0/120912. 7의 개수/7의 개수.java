class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0, length = (array[i]+"").length(); j < length; j++){
                if(((array[i]+"").charAt(j)+"").equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}