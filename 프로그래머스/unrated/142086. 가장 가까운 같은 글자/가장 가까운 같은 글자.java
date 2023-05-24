import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        
        int[] answer = new int[ch.length];
        for(int i=0; i<ch.length; i++) {
            int pos = map.getOrDefault(ch[i], -1);
            answer[i] = pos==-1 ? -1: i-pos;
            map.put(ch[i], i);
        }
        return answer;
    }
}