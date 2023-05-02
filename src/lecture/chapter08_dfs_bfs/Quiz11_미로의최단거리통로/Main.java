package lecture.chapter08_dfs_bfs.Quiz11_미로의최단거리통로;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int n;
    static int[] x = {0, 1, 0, -1};
    static int[] y = {1, 0, -1, 0};
    static int[][] arr;
    public int BFS(int i, int j){
        int answer = -1;
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(i, j));

        while (!Q.isEmpty()){
            Point temp = Q.poll();
            int tx = temp.x;
            int ty = temp.y;
            for (int k = 0; k < 4; k++) {
                int kx = tx+x[k];
                int ky = ty+y[k];
                if (kx >= 1 && kx <= n && ky >= 1 && ky <= n && arr[kx][ky] == 0) {
                    arr[kx][ky] = arr[tx][ty] + 1;
                    Q.offer(new Point(kx, ky));
                }
            }
        }
        if(arr[n][n] != 0) answer = arr[n][n];
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = 7;
        arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.BFS(1, 1));
    }
}
