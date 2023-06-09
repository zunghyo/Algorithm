package lecture.chapter02_array.Quiz4_피보나치수열;

import java.util.Scanner;

public class Main {

    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x+" ");
        }
    }
}
