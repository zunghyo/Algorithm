import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int wordIndex = 0;

        for(int i=0; i<chars.length; i++) {
            if(chars[i] == ' ') {
                wordIndex = 0;
            } else {
                if(wordIndex % 2 == 0) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
                wordIndex++;
            }
        }
        return new String(chars);
    }
}