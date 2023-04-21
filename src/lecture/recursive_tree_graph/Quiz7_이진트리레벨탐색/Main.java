package lecture.recursive_tree_graph.Quiz7_이진트리레벨탐색;

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
    public void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L+" : ");
            for (int i = 0; i < len; i++) {
                Node node = Q.poll();
                System.out.print(node.data+" ");
                if(node.lt != null) Q.offer(node.lt);
                if(node.rt != null) Q.offer(node.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.BFS(T.root);
    }

}
