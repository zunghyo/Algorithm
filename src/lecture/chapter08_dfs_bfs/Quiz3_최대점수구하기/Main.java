package lecture.chapter08_dfs_bfs.Quiz3_최대점수구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n;
    static int max;
    static int answer;

    public void DFS(ArrayList<int[]> list, int result, int sum, int L){
        if(sum > max) return;
        if(L == n) answer = Math.max(answer, result);
        else {
            int[] arr = list.get(L);
            DFS(list, result+arr[0], sum+arr[1],L+1);
            DFS(list, result, sum,L+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        max = in.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[2];
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            list.add(arr);
        }
        T.DFS(list,0, 0, 0);
        System.out.println(answer);
    }

}
