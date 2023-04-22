package lecture.chapter06_sorting_searching.Quiz3_삽입정렬;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr){
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i-1; j > -1; j--) {
                if(arr[j] > temp) arr[j + 1] = arr[j];
                else break;;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        for (int x: T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}
