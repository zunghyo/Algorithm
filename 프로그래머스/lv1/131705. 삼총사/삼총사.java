class Solution {
    int answer = 0;
    public int solution(int[] number) {
        dfs(0, 0, number, 0);
        return answer;
    }
    
    public void dfs(int i, int sum, int[] number, int cnt){
        if(cnt==3 && sum==0) answer++;
        else{
            if(i<number.length){
                dfs(i+1, sum, number, cnt);
                dfs(i+1, sum+number[i], number, cnt+1);
            }
        }
    }
}