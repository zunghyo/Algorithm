package lecture.string.Quiz12_암호;

import java.util.Scanner;

public class Main {

    public String solution(String strs, int n){
        String answer = "";
        strs = strs.replace("#", "1").replace("*", "0");
        for (int i = 0; i < strs.length(); i=i+7) {
            answer += (char) Integer.parseInt(strs.substring(i,i+7),2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(str, n));
    }
}
