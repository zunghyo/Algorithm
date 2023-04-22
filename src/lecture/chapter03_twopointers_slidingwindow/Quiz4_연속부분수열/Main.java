package lecture.chapter03_twopointers_slidingwindow.Quiz4_연속부분수열;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int n, int k){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == k) answer++;
            while (sum > k){
                sum -= arr[lt++];
                if(sum == k) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(arr, n, k));
    }
}
