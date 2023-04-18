package lecture.stackandqueue.Quiz5_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str){
        int answer = 0;
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='(') stack.push(str.charAt(i));
            else {
                stack.pop();
                if(str.charAt(i-1)=='(') answer += stack.size();
                else answer++;
            }
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
