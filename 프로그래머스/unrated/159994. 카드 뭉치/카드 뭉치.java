class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int card1 = 0;
        int card2 = 0;
        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(cards1[card1])){
                if(card1 < cards1.length - 1) card1 ++;
            } else if(goal[i].equals(cards2[card2])){
                if(card2 < cards2.length - 1) card2 ++;
            } else {
                return "No";
            }
        }
        answer = "Yes";
        return answer;
    }
}