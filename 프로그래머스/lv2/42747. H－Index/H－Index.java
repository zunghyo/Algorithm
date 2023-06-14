import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int answer = 0;
        for(int i=0; i<citations.length; i++){
            int min = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, min);
        }
        
        
        return answer;
    }
}