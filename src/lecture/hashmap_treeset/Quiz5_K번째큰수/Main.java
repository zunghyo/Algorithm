package lecture.hashmap_treeset.Quiz5_K번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public int solution(int[] arr, int n, int k){
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    set.add(sum);
                }
            }
        }
        int cnt = 1;
        for (int x: set) {
            if(cnt++ == k) answer = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}
