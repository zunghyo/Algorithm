import java.util.*;

class Solution {
    public String solution(String X, String Y) {

        int[] yChars = new int[256]; // ASCII 범위에 대한 출현 횟수 저장
        
        for(char y: Y.toCharArray()) {
            yChars[y]++;
        }
        
        List<Character> result = new ArrayList<>();
        
        for(char x: X.toCharArray()) {
            if(yChars[x] > 0) {
                yChars[x]--;
                result.add(x);
            }
        }
        
        if(result.isEmpty()) return "-1";
        result.sort(Collections.reverseOrder());
        
        StringBuilder answer = new StringBuilder();
        result.forEach(answer::append);
        
        if(answer.toString().substring(0,1).equals("0")) return "0";
        
        return answer.toString();
    }
}