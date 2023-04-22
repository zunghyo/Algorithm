package lecture.chapter07_recursive_tree_graph.Quiz14_그래프최단거리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int x){
        ch[x] = 1;
        dis[x] = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(x);
        while (!Q.isEmpty()) {
            int qv = Q.poll();
            for (int gv: graph.get(qv)) {
                if(ch[gv] == 0){
                    ch[gv] = 1;
                    Q.offer(gv);
                    dis[gv] = dis[qv]+1;
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
        dis = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : "+dis[i]);
        }
    }

}
