package lecture.recursive_tree_graph.Quiz8_송아지찾기;

import java.util.*;

public class Main {

    public int BFS(int s, int e){
        int answer = 0;
        int[] move = {1, -1, 5};
        int[] ch = new int[100001];
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        ch[s] = 1;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int pos = Q.poll();
                for (int j = 0; j < move.length; j++) {
                    int nx = pos + move[j];
                    if(nx == e) return answer+1;
                    else if(nx >= 1 && nx <= 10000 && ch[nx]==0) {
                        Q.offer(nx);
                        ch[nx] = 1;
                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(T.BFS(s, e));
    }

}
