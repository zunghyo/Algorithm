package lecture.array.Quiz1_큰수출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int[] arr, int n){
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
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
            System.out.print(x+" ");
        }
    }
}
