class Solution {
    int answer = 0; 
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    public void dfs(int L, int sum, int[] numbers, int target){
        if(L==numbers.length && sum == target) answer++;
        else {
            if(L < numbers.length){
                dfs(L+1, sum-numbers[L], numbers, target);
                dfs(L+1, sum+numbers[L], numbers, target);
            }
        }
    }
}