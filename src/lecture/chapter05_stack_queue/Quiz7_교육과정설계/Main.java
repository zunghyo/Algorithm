package lecture.chapter05_stack_queue.Quiz7_교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution(String subject, String need){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x: need.toCharArray()) Q.offer(x);
        for (char x: subject.toCharArray()) {
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String ess = in.next();
        String subject = in.next();
        System.out.println(T.solution(subject, ess));
    }
}
