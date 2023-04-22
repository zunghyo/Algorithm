package lecture.chapter07_recursive_tree_graph.Quiz1_재귀함수;

import java.util.Scanner;

public class Main {

    public void solution(int n){
        if(n > 0){
            solution(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        T.solution(n);
    }

}
