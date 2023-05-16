class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int steps = 0;
        int zeroCnt = 0;
        
        while(!"1".equals(s)){
            int currentLength = s.replace("0" ,"").length();
            steps++;
            zeroCnt += s.length() - currentLength;
            s = Integer.toBinaryString(currentLength);
        }
        answer[0] = steps;
        answer[1] = zeroCnt;
        return answer;
    }
}