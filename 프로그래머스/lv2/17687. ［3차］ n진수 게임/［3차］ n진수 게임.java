import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String temp = "";
        for(int i=0; temp.length() < t*m; i++) 
            temp += Integer.toString(i,n).toUpperCase();
        
        String answer = "";
        for(int i=p; i<=t*m; i=i+m) 
            answer += temp.charAt(i-1);
        return answer;
    }
}