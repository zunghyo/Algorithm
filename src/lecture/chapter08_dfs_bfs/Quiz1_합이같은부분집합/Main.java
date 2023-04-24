package lecture.chapter08_dfs_bfs.Quiz1_합이같은부분집합;

import java.util.Scanner;

public class Main {

    static String answer = "NO";
    static int n;
    static boolean state = false;
    static int total;
    public void DFS(int[] arr, int sum, int L){
        if(state) return;
        if(sum > total/2) return;
        if(L==n){
            if((total-sum) == sum){
                state = true;
                answer = "YES";
            }
        }else {
            DFS(arr, sum+arr[L], L+1);
            DFS(arr, sum, L+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        T.DFS(arr, 0, 0);
        System.out.println(answer);
    }

}
