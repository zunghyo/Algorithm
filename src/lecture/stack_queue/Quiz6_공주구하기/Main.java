package lecture.stack_queue.Quiz6_공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) queue.offer(i);
        while (queue.size() > 1){
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
        }
        answer = queue.remove();
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(T.solution(n, k));
    }
}
