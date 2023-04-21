package lecture.sorting_searching.Quiz5_중복확인;

import java.util.Scanner;

public class Main {

    public Character solution(int n, int[] arr){
        Character answer = 'U';
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j] == arr[i]) return 'D';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
