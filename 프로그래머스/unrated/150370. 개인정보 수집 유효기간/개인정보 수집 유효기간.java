import java.util.*;
import java.time.*;
import java.time.format.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0, length = terms.length; i < length; i++){
            map.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2)));
        }
        
        List<Integer> list = new ArrayList<>();
        LocalDate now = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        
        for(int i = 0, length = privacies.length; i < length; i++){
            LocalDate date = LocalDate.parse(privacies[i].substring(0, 10), DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            date = date.plusMonths(map.get(privacies[i].substring(11)));
            if(date.isBefore(now) || date.isEqual(now)) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0, size = list.size(); i < size; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}