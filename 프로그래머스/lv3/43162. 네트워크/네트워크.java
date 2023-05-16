class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        boolean[] check = new boolean[len];
        
        for(int i=0; i<len; i++){
            if(check[i]==false){
                DFS(computers, i, check);
                answer++;
            }
        }
        return answer;
    }
    
    public void DFS(int[][] computers, int i, boolean[] check){
        check[i] = true;
        for(int j=0; j<computers.length; j++){
            if(i!=j && computers[i][j]==1 && check[j]==false){
                DFS(computers, j, check);
            }
        }
    }
}