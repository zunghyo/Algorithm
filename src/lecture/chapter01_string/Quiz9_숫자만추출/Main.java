package lecture.chapter01_string.Quiz9_숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution(String str){
        str = str.replaceAll("[^0-9]", "");
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
