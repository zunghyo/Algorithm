package lecture.chapter02_array.Quiz9_격자판최대합;

import java.util.Scanner;

public class Main {

    public int solution(int[][] arr, int n){
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < n; i++) {
            sum3 += arr[i][i];
            sum4 += arr[i][n-1-i];
        }
        answer = Math.max(sum3, answer);
        answer = Math.max(sum4, answer);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(T.solution(arr, n));
    }
}
