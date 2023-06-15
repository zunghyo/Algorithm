import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char currentChar: s.toCharArray()) {
            int cnt = 1;
            while(cnt <= index) {
                currentChar++;
                if(!Character.isAlphabetic(currentChar)) currentChar = 'a';
                if(skip.contains(String.valueOf(currentChar))) continue;
                cnt++;
            }
            answer += (char) currentChar;
        }
        
        return answer;
    }
}