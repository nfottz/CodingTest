import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<Long> list = new ArrayList<>();
        int lengthT = t.length();
        int lengthP = p.length();
        for(int i = 0; i < lengthT - lengthP + 1; i++){
            long num = Long.parseLong(t.substring(i, i+lengthP));
            list.add(num);
        }
        long longP = Long.parseLong(p);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) <= longP) answer++;
        }
        return answer;
    }
}