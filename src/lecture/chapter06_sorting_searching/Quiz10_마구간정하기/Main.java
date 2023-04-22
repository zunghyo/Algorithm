package lecture.chapter06_sorting_searching.Quiz10_마구간정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int count(int[] arr, int c){
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-ep >= c) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int k, int n, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arr, mid) >= k) {
                answer = mid;
                lt = mid+1;
            } else rt = mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println(T.solution(k, n, arr));
    }
}
