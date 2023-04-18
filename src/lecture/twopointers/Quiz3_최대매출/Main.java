package lecture.twopointers.Quiz3_최대매출;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int n, int m){
        int sum = 0;
        for (int i = 0; i < m; i++) sum += arr[i];
        int answer = sum;
        for (int i = m; i < n; i++) {
            sum = sum + arr[i] - arr[i-m];
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(arr, n, m));
    }
}
