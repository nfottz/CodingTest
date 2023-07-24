class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i)+"").equalsIgnoreCase("p")) pCount++;
            if((s.charAt(i)+"").equalsIgnoreCase("y")) yCount++;
        }
        if(pCount != yCount) answer = false;
        return answer;
    }
}