class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(char ch: my_string.toCharArray()) {
            answer += String.valueOf(ch).repeat(n);
        }
        return answer;
    }
}