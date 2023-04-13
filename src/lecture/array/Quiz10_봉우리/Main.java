package lecture.array.Quiz10_봉우리;

import java.util.Scanner;

public class Main {

    public int solution(int[][] arr, int n){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(arr[i][j] > arr[i-1][j] &&
                        arr[i][j] > arr[i][j-1] &&
                        arr[i][j] > arr[i+1][j] &&
                        arr[i][j] > arr[i][j+1]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(T.solution(arr, n));
    }
}
