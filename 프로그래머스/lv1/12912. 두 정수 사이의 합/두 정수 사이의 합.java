class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int start = a, end = b;
        if(b < a) {
            start = b;
            end = a;
        }
        for(int i=start; i<=end; i++) answer+= i;
        return answer;
    }
}