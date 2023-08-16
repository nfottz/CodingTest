class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] key = new int[26];
        for(int i = 0; i < 26; i++){
            int min = 100;
            for(int j = 0, length = keymap.length; j < length; j++){
                char ch = (char)(i + 65);
                int k = keymap[j].indexOf(ch);
                if(k != -1) min = Math.min(min, k);
            }
            key[i] = min + 1;
        }
        for(int i = 0, length = targets.length; i < length; i++){
            for(int j = 0, size = targets[i].length(); j < size; j++){
                int temp = (int)targets[i].charAt(j) - 65;
                if(key[temp] == 101){
                    answer[i] = -1; break;
                } else {
                    answer[i] += key[temp];
                }
            }
        }
        return answer;
    }
}