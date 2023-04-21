package lecture.recursive_tree_graph.Quiz2_이진수출력;

import java.util.Scanner;

public class Main {

    public void solution(int n){
        if(n == 0) return;
        else {
            solution(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        T.solution(n);
    }

}
