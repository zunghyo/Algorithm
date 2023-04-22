package lecture.chapter02_array.Quiz8_등수구하기;

import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr, int n){
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
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
        for (int x : T.solution(arr, n)) {
            System.out.print(x+" ");
        }
    }
}
