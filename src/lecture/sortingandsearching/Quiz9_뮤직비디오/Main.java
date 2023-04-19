package lecture.sortingandsearching.Quiz9_뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for (int x: arr) {
            if(sum+x <= capacity){
                sum+=x;
            }else{
                cnt++;
                sum = x;
            }
        }
        return cnt;
    }

    public int solution(int k, int n, int[] arr){
        int answer = -1;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            int cnt = count(arr, mid);
            if(cnt <= k){
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
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
