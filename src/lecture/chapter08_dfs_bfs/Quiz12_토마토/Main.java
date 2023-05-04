package lecture.chapter08_dfs_bfs.Quiz12_토마토;

import java.util.*;

class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m;
    static int[][] arr;
    static Queue<Point> Q = new LinkedList<>();
    static int day = 0;
    static int cnt = 0;
    public void BFS(){
        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};

        while(!Q.isEmpty()){
            Point temp = Q.poll();
            cnt++;
            for(int k=0; k<4; k++){
                int kx = temp.x + x[k];
                int ky = temp.y + y[k];
                if(kx>=0 && kx<n && ky>=0 && ky<m && arr[kx][ky] == 0){
                    Q.offer(new Point(kx, ky));
                    arr[kx][ky] = arr[temp.x][temp.y] +1;
                    day = arr[temp.x][temp.y];
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        arr = new int[n][m];
        int total = n*m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] == 1) Q.offer(new Point(i, j));
                if(arr[i][j] == -1) total--;
            }
        }
        T.BFS();
        if(cnt == total) System.out.println(day);
        else System.out.println(-1);
    }
}
