class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
                         "....", "..", ".---", "-.-", ".-..", "--", "-.", 
                         "---", ".--.", "--.-", ".-.", "...", "-", "..-" ,
                         "...-", ".--", "-..-", "-.--", "--.."};
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                            "j", "k", "l", "m", "n", "o", "p", "q", "r",
                            "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] letterMorse = letter.split(" ");
        
        for(int i = 0; i < letterMorse.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(morse[j].equals(letterMorse[i])){
                    answer += alphabet[j];
                }
            }
        }
        return answer;
    }
}