package lecture.stack_queue.Quiz8_응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    class Patient{
        int idx;
        int risk;

        public Patient(int idx, int risk) {
            this.idx = idx;
            this.risk = risk;
        }
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Patient> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) Q.offer(new Patient(i, arr[i]));
        while (!Q.isEmpty()){
            Patient poll = Q.poll();
            for (Patient x: Q) {
                if(x.risk > poll.risk){
                    Q.offer(poll);
                    poll = null;
                    break;
                }
            }
            if(poll!=null){
                answer++;
                if(poll.idx==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
