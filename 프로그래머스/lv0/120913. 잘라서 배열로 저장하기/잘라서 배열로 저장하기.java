class Solution {
    public String[] solution(String my_str, int n) {
        int size = 0;
        if(my_str.length() % n == 0) size = my_str.length()/n;
        else size = my_str.length()/n + 1;
        
        String[] answer = new String[size];
        int j = 0;
        for(int i = 0; i < size - 1; i++){
            answer[i] = my_str.substring(j, j+n);
            j = j + n;
        }
        answer[size - 1] = my_str.substring(j);
        
        return answer;
    }
}