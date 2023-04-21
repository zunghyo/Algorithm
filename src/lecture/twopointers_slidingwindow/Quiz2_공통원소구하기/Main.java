package lecture.twopointers_slidingwindow.Quiz2_공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int[] arrA, int n, int[] arrB, int m){
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int i = 0;
        int j = 0;
        while (i < n && j <m){
            if(arrA[i] == arrB[j]){
                answer.add(arrA[i++]);
                j++;
            } else if (arrA[i] < arrB[j]) i++;
            else j++;
        }
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
