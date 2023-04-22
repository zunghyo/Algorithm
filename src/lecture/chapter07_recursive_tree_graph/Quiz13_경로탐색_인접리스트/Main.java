package lecture.chapter07_recursive_tree_graph.Quiz13_경로탐색_인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int answer = 0;
    public void DFS(int x){
        if(x == n) answer++;
        else {
            for (int nv : graph.get(x)) {
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        ch = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}
