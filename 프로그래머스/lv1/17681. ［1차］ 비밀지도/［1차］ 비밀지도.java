class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] map1 = new char[n][n];
        char[][] map2 = new char[n][n];
        
        for(int i = 0; i < n; i++){
            String s1 = Integer.toString(arr1[i], 2);
            while(s1.length() < n){
                s1 = "0" + s1;
            }
            map1[i] = s1.toCharArray();
            String s2 = Integer.toString(arr2[i], 2);
            while(s2.length() < n){
                s2 = "0" + s2;
            }
            map2[i] = s2.toCharArray();
        }
        
        for(int i = 0; i < n; i++){
            String s = "";
            for(int j = 0; j < n; j++){
                if(map1[i][j] == 48 && map2[i][j] == 48) s += " ";
                else s += "#";
            }
            answer[i] = s;
        }
        
        return answer;
    }
}