package lecture.string.Quiz8_유효한팰린드롬;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String str2 = new StringBuilder(str).reverse().toString();
        if(!str.equals(str2)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
