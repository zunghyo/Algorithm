import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int[][] wiresMap = new int[n+1][n+1];
        
        for(int[] wire: wires) {
            int i = wire[0];
            int j = wire[1];
            
            wiresMap[i][j] = 1;
            wiresMap[j][i] = 1;
        }
        
        
        for(int[] wire: wires) {
            int i = wire[0];
            int j = wire[1];
            
            wiresMap[i][j] = 0;
            wiresMap[j][i] = 0;
                        
            int first = dfs(1, wiresMap);
            int second = n-first;
            int diff = Math.abs(first-second);
            answer = Math.min(answer, diff);
            
            wiresMap[i][j] = 1;
            wiresMap[j][i] = 1;
        }
        
        return answer;
    }
    
    public int dfs(int depth, int[][] wiresMap){
        int wiresMapLen = wiresMap.length;
        boolean[][] visited = new boolean[wiresMapLen][wiresMapLen];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(depth);
        
        int counter = 0;
        
        while(!queue.isEmpty()) {
            depth = queue.poll();
            for(int i=1; i<wiresMapLen; i++) {
                if(depth == i) continue;
                if(wiresMap[depth][i] == 1 && !visited[depth][i]) {
                    queue.offer(i);
                    visited[depth][i] = true;
                    visited[i][depth] = true;
                }
            }
            counter++;
        }
        
        return counter;
    }
}