package lecture.chapter02_array.Quiz12_멘토링;

import java.util.Scanner;

public class Main {

    public int solution(int[][] arr, int n, int m){
        int answer = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cnt = 0;
                for (int k = 0; k < m; k++) {
                    int p1 = 0; int p2 = 0;
                    for (int l = 0; l < n; l++) {
                        if(arr[k][l] == i) p1 = l;
                        if(arr[k][l] == j) p2 = l;
                    }
                    if(p1 < p2) cnt++;
                }
                if(cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(T.solution(arr, n, m));
    }
}
