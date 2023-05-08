import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> st = new Stack<>();
        
        for(char ch: s.toCharArray()){
            if(ch == '(') st.push(ch);
            else {
                if(st.isEmpty() || st.pop() != '(') {
                    answer = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()) answer = false;

        return answer;
    }
}