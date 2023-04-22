package lecture.chapter01_string.Quiz2_대소문자변환;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer="";
        for (char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch)) answer += Character.toLowerCase(ch);
            else answer += Character.toUpperCase(ch);
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
