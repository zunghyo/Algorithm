import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set1 = new HashSet<>();
        for(String s: s1){
            set1.add(s);
        }
        for(String s: s2){
            if(set1.contains(s)) answer++;
        }
        
        return answer;
    }
}