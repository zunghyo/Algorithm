package lecture.string.Quiz5_특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length-1;
        while (lt < rt){
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                 char temp = chars[lt];
                 chars[lt] = chars[rt];
                 chars[rt] = temp;
                 lt++;
                 rt--;
             }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
