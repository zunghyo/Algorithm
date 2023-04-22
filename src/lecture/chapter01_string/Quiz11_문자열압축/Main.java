package lecture.chapter01_string.Quiz11_문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer = "";
        int cnt = 1;
        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == temp) cnt++;
            else{
                answer += temp + String.valueOf(cnt).replace("1","");
                cnt = 1;
                temp = str.charAt(i);
            }
        }
        answer += temp + String.valueOf(cnt).replace("1","");
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}
