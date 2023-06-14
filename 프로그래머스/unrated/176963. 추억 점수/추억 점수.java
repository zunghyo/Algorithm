import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = new int[photos.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photos.length; i++) {
            int yearningSum = 0;
            for(String friend: photos[i]) {
                yearningSum += map.getOrDefault(friend, 0);
            }
            answer[i] = yearningSum;
        }
        
        return answer;
    }
}