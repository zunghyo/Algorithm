package lecture.array.Quiz7_점수계산;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int n){
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) cnt = 0;
            else {
                cnt++;
                answer += cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(arr, n));
    }
}
