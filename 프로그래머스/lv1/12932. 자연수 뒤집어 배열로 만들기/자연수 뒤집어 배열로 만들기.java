class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int strLen = strN.length();
        int[] answer = new int[strLen];
        
        for(int i=0; i<strLen; i++){
            answer[strLen-i-1] = strN.charAt(i)-'0';
        }
        return answer;
    }
}