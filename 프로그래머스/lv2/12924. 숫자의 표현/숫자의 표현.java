class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1, end = 1;
        int sum = 0;
        
        while(start <= n/2+1){
            if(sum < n) sum += end++;
            else if(sum > n) sum -= start++;
            else {
                answer++;
                sum -= start++;
            }
        }
        if(n > 2) answer = answer+1;
        return answer;
    }
}