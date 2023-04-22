package lecture.chapter01_string.Quiz7_회문문자열;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        str = str.toUpperCase();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt){
            if(str.charAt(lt++) != str.charAt(rt--)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
