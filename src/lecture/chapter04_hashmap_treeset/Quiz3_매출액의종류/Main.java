package lecture.chapter04_hashmap_treeset.Quiz3_매출액의종류;

import java.util.*;

public class Main {

    public List<Integer> solution(int[] arr, int n, int k){
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k-1; i++) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());

            map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
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
        for (int x: T.solution(arr,n,k)) {
            System.out.print(x + " ");
        }
    }
}
