package lecture.recursive_tree_graph.Quiz10_Tree말단노드까지의가장짧은경로_BFS;

import java.util.LinkedList;
import java.util.Queue;

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
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node node = Q.poll();
                if(node.lt == null && node.rt == null) return L;
                if(node.lt != null) Q.offer(node.lt);
                if(node.rt != null) Q.offer(node.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.BFS(T.root));;
    }

}
