package lecture.chapter01_string.Quiz4_단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(String[] strs){
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strs) {
            answer.add(new StringBuilder(str).reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for (String str : T.solution(strs)) {
            System.out.println(str);
        }
    }
}
