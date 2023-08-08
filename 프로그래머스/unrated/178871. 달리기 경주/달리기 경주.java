import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(String calling : callings){
            int grade = map.get(calling);
            String temp = players[grade - 1];
            players[grade - 1] = calling;
            map.put(calling, grade - 1);
            players[grade] = temp;
            map.put(temp, grade);
        }
        return players;
    }
}