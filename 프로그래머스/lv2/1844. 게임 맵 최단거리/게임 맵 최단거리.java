import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int rowLen = maps.length;
        int colLen = maps[0].length;
        
        int[][] visited = new int[rowLen][colLen];
        visited[0][0] = 1;
        
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(0, 0));
        
        while(!q.isEmpty()) {
            Position cp = q.poll();
            
            for(int[] direction: directions) {
                int nx = cp.x + direction[0];
                int ny = cp.y + direction[1];
                
                if(nx == rowLen-1 && ny == colLen-1) {
                    return visited[cp.x][cp.y]+1;
                }
                if(nx >= 0 && nx < rowLen && ny >= 0 && ny < colLen && maps[nx][ny] == 1 && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[cp.x][cp.y]+1;
                    q.offer(new Position(nx, ny));
                }
            }
        }
        
        return -1;
    }
}

class Position {
    int x;
    int y;
    Position (int x, int y) {
        this.x = x;
        this.y = y;
    }
}