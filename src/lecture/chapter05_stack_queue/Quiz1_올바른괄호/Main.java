package lecture.chapter05_stack_queue.Quiz1_올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
