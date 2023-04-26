package lecture.chapter08_dfs_bfs.Quiz5_동전교환;

import java.util.*;

public class Main {

    static int n, m,  answer = Integer.MAX_VALUE;
    public void DFS(Integer[] arr, int sum, int L){
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m){
            answer = Math.min(answer, L);
        }else {
            for (int i = 0; i < n; i++) {
                DFS(arr, sum + arr[i], L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = in.nextInt();
        T.DFS(arr, 0, 0);
        System.out.println(answer);
    }

}
