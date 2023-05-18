class Solution {
    public int solution(String before, String after) {
        
        
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'
                           , 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r'
                           , 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        int[] count1 = new int[26];
        for(int i = 0; i < before.length(); i++){
            for(int j = 0; j < alphabet.length; j++){
                if(before.charAt(i) == alphabet[j]){
                    count1[j]++;
                }
            }
        }
        
        int[] count2 = new int[26];
        for(int i = 0; i < after.length(); i++){
            for(int j = 0; j < alphabet.length; j++){
                if(after.charAt(i) == alphabet[j]){
                    count2[j]++;
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < 26; i++){
            if(count1[i] != count2[i]) {
                answer = 0; break;
            } else answer = 1;
        }
        
        return answer;
    }
}