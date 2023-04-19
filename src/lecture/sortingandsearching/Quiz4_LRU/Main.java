package lecture.sortingandsearching.Quiz4_LRU;

import java.util.Scanner;

public class Main {

    public int[] solution(int k, int n, int[] arr){
        int[] answer = new int[k];
        for (int i = 0; i < n; i++) {
            int idx = k-1;
            for (int j = 0; j < k; j++) {
                if(answer[j] == arr[i]) idx = j;
            }
            for (int j = idx-1; j > -1; j--) {
                if(answer[j] != 0) answer[j + 1] = answer[j];
            }
            answer[0] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        for (int x: T.solution(k, n, arr)) {
            System.out.print(x+" ");
        }
    }
}
