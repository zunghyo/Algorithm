import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Character[] chars = new Character[str.length()];
        for(int i=0; i<chars.length; i++){
            chars[i] = str.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(char ch: chars){
            sb.append(ch);
        }
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}