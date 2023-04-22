package lecture.chapter02_array.Quiz3_가위바위보;

import java.util.Scanner;

public class Main {

    public char[] solution(int[] arrA, int[] arrB, int n){
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if(arrA[i]-arrB[i] == 0) answer[i] = 'D';
            else if(arrA[i]-arrB[i] == 1 || arrA[i]-arrB[i] == -2) answer[i] = 'A';
            else answer[i] = 'B';
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = in.nextInt();
        }
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = in.nextInt();
        }
        for (char s :T.solution(arrA, arrB, n)) {
            System.out.println(s);
        }
    }
}
