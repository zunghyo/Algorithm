package lecture.recursive_tree_graph.Quiz4_피보나치;

import java.util.Scanner;

public class Main {

    static int[] fibo;

    public int solution(int n){
        if(fibo[n]>0) return fibo[n];
        if(n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibo = new int[n+1];
        T.solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }

}
