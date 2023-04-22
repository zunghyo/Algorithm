package lecture.chapter07_recursive_tree_graph.Quiz12_경로탐색_DFS;

import java.util.Scanner;

public class Main {

    static int n, m;
    static int[][] graph;
    static int[] ch;
    static int answer = 0;
    public void DFS(int x){
        if(x == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if(graph[x][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}
