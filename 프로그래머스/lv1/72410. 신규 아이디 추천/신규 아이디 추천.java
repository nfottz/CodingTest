class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        for(int i = 0; i < new_id.length(); i++){
            char c = new_id.charAt(i);
            String s = c + "";
            if(c < 48 || c > 57){
                if(c < 97 || c > 122){
                    if(s.equals("-") == false && s.equals("_") == false && s.equals(".") == false){
                        new_id = new_id.replace(s, "");
                        i--;
                    }
                }
            }
        }
        while(new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        if(new_id.startsWith(".")) new_id = new_id.substring(1);
        if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);
        if(new_id.isBlank()) new_id = "a";
        if(new_id.length() >= 16) new_id = new_id.substring(0, 15);
        if(new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);
        if(new_id.length() <= 2){
            while(new_id.length() < 3){
                new_id += new_id.substring(new_id.length() - 1);
            }
        } 
        answer = new_id;
        return answer;
    }
}