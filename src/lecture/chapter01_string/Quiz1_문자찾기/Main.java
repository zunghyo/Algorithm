package lecture.chapter01_string.Quiz1_문자찾기;

import java.util.Scanner;

public class Main {

    public int solution(String str, char ch){
        int answer=0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        for (char s: str.toCharArray()) {
            if(ch == s) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch = in.next().charAt(0);
        System.out.println(T.solution(str, ch));
    }

}
