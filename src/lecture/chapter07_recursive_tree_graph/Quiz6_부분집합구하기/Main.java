package lecture.chapter07_recursive_tree_graph.Quiz6_부분집합구하기;

public class Main {

    static int n ;
    static int[] ch;
    public void DFS(int L){
        String tmp = "";
        if(L > n){
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp += i;
            }
            if(tmp.length() > 0) System.out.println(tmp);
        } else{
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }

}
