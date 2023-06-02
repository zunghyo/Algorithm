import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char ch: s.toCharArray()){
            if(ch==' ') answer += ch;
            else {
                int temp = ch+n;
                if(Character.isUpperCase(ch) && !Character.isUpperCase(temp)) temp-=26;
                else if(Character.isLowerCase(ch) && !Character.isLowerCase(temp)) temp-=26;
                answer += (char) temp;
            }
        }
        return answer;
    }
}