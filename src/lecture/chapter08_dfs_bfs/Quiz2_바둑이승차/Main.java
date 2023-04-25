package lecture.chapter08_dfs_bfs.Quiz2_바둑이승차;

import java.util.Scanner;

public class Main {

    static int n;
    static int max;
    static int answer;

    public void DFS(int[] arr, int sum, int L){
        if(sum > max) return;
        if(L == n) answer = Math.max(sum, answer);
        else {
            DFS(arr, sum + arr[L], L + 1);
            DFS(arr, sum, L+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        max = in.nextInt();
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        T.DFS(arr, 0, 0);
        System.out.println(answer);
    }

}
