package lecture.chapter01_string.Quiz3_문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer="";
        for(String s : str.split(" ")){
            if(s.length() > answer.length()) answer = s;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
