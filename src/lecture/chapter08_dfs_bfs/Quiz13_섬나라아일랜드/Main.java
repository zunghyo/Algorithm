package lecture.chapter08_dfs_bfs.Quiz13_섬나라아일랜드;

import java.util.*;

public class Main {

    static int n;
    static int[][] arr;
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    static int[] dy = {-1,0,1,1,1,0,-1,-1};
    static int answer = 0;

    public void DFS(int x, int y){
        for (int i = 0; i < 8; i++) {
            int tx = x + dx[i];
            int ty = y + dy[i];
            if(tx>=0 && tx<n && ty>=0 && ty<n && arr[tx][ty] == 1){
                arr[tx][ty] = 0;
                DFS(tx, ty);
            }
        }
        arr[x][y] = 0;
    }

    public void solution(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1) {
                    answer++;
                    arr[i][j] = 0;
                    DFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        T.solution();
        System.out.println(answer);
    }

}
