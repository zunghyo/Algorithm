package lecture.chapter06_sorting_searching.Quiz8_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int k, int n, int[] arr){
        int answer = -1;
        int lt = 0;
        int rt = n-1;
        Arrays.sort(arr);
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(arr[mid] == k) return mid+1;
            if(arr[mid] > k) rt = mid -1;
            else lt = mid +1;
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
