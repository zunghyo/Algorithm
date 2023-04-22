package lecture.recursive_tree_graph.Quiz9_Tree말단노드까지의가장짧은경로_DFS;

class Node{
    int data;
    Node lt, rt;
    Node(int val){
        data = val;
        lt = rt = null;
    }
}
public class Main {
    Node root;
    public int DFS(int L, Node root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));;
    }

}
