import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> keys = new HashMap<>();
        
        for(String key: keymap) {
            for(int i=0; i<key.length(); i++) {
                char currentKey = key.charAt(i);
                int min = Math.min(keys.getOrDefault(currentKey, Integer.MAX_VALUE), i+1);
                keys.put(currentKey, min);
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++) {
            int result = 0;
            for(int j=0; j<targets[i].length(); j++) {
                char currentTarget = targets[i].charAt(j);
                if(!keys.containsKey(currentTarget)){
                    result = -1;
                    break;
                }
                result += keys.get(currentTarget);
            }
            answer[i] = result;
        }
        
        return answer;
    }
}