class Solution {
    public int[] solution(int[][] score) {

        int length = score.length;
        int[] answer = new int[length];
        double[] average = new double[length];
        for(int i = 0; i < length; i++){
            average[i] = (score[i][0]+score[i][1])/2.0;
        }

        for(int i = 0; i < length; i++){
            int rank = 1;
            for(int j = 0; j < length; j++){
                if(i == j) continue;
                if(average[j] > average[i]) rank++;
            } answer[i] = rank;
        }
        
        return answer;
    }
}