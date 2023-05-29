class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] ch = new int[n+1][m+1];
        for(int[] puddle: puddles){
            ch[puddle[1]][puddle[0]] = -1;
        }
        
        ch[1][1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(ch[i][j] == -1) ch[i][j] = 0;
                else{
                    if(i>1) ch[i][j] += ch[i-1][j]%1000000007;
                    if(j>1) ch[i][j] += ch[i][j-1]%1000000007; 
                }
            }
        }
        
        int answer = ch[n][m]%1000000007;
        return answer;
    }
}