package lecture.twopointers.Quiz1_두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int[] arr, int n, int[] arr2, int m){
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j <m){
            if(arr[i] <= arr2[j]) answer.add(arr[i++]);
            else answer.add(arr2[j++]);
        }
        while (i < n) answer.add(arr[i++]);
        while (j < m) answer.add(arr2[j++]);
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
        int m = in.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = in.nextInt();
        }
        for (int x : T.solution(arrA, n, arrB, m)) {
            System.out.print(x+" ");
        }
    }
}
