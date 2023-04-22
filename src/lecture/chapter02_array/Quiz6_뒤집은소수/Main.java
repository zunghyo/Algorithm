package lecture.chapter02_array.Quiz6_뒤집은소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public boolean isPrime(int n){
        if(n == 1) return false;
        else {
            for (int i = 2; i < n; i++) {
                if(n%i == 0) return false;
            }
        }
        return true;
    }

    public List<Integer> solution(int[] arr, int n){
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;
            while (temp > 0){
                int t = temp%10;
                res = res*10 + t;
                temp = temp/10;
            }
            if(isPrime(res)) answer.add(res);
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
            System.out.print(x + " ");
        }
    }
}
