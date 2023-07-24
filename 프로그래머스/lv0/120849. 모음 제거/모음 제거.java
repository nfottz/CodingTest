class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < vowel.length; j++){
                if((my_string.charAt(i)+"").equals(vowel[j])){
                    my_string = my_string.replace((my_string.charAt(i)+""),"");
                }                
            }
        answer = my_string;
        }
        
        return answer;
    }
}