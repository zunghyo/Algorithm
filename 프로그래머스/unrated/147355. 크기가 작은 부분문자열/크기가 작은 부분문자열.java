class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long ip = Long.parseLong(p);
        int pLen = p.length();
        
        for(int i=0; i<=t.length()-pLen; i++){
            String temp = t.substring(i, i+pLen);
            if(Long.parseLong(temp) <= ip) answer++;
        }
        return answer;
    }
}