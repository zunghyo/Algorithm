package lecture.stackandqueue.Quiz2_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if(x != ')') stack.push(x);
            else while (stack.pop() != '(') ;
        }
        for (char x: stack) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
