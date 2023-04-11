package lecture.string.Quiz6_중복문자제거;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(answer.indexOf(str.charAt(i)) == -1) answer += str.charAt(i);
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
