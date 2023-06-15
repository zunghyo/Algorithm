import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clotheMap = new HashMap<>();
        for(String[] clothe: clothes) {
            clotheMap.put(clothe[1], clotheMap.getOrDefault(clothe[1], 0)+1);
        }
        int answer = 1;
        for(int value: clotheMap.values()){
            answer *= (value+1);
        }
        return answer-1;
    }
    
}