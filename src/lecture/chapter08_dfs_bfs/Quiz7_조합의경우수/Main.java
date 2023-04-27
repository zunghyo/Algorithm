package lecture.chapter08_dfs_bfs.Quiz7_조합의경우수;

import java.util.Scanner;

public class Main {

    int[][] arr = new int[35][35];
    public int DFS(int n, int r){
        if(arr[n][r] > 0) return arr[n][r];
        if(r==0 || r==n) return 1;
        else{
            return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(T.DFS(n, r));
    }

}
