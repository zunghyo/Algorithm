package lecture.sortingandsearching.Quiz6_장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int n, int[] arr){
        List<Integer> answer = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if(arr[i] != temp[i]) answer.add(i + 1);
        }
        return answer;
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
