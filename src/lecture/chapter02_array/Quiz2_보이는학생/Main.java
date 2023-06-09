package lecture.chapter02_array.Quiz2_보이는학생;

import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int n){
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
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
