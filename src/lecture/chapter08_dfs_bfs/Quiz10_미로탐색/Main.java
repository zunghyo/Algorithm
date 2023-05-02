package lecture.chapter08_dfs_bfs.Quiz10_미로탐색;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] x = {0, 1, 0, -1};
    static int[] y = {1, 0, -1, 0};
    static int[][] arr;
    static int cnt = 0;

    public void DFS(int i, int j){
        if(i == n && j == n) cnt++;
        else{
            for (int k = 0; k < 4; k++) {
                if(i>=1 && i <=n && j>=1 && j<=n && arr[i][j]==0){
                    arr[i][j] = 1;
                    DFS(i + x[k], j + y[k]);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = 7;
        arr = new int[n + 1][n + 1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        T.DFS(1, 1);
        System.out.println(cnt);
    }
}
