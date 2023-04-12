package lecture.string.Quiz10_가장짧은문자거리;

import java.util.Scanner;

public class Main {

    public int[] solution(String str, char ch){
        int[] answer = new int[str.length()];
        int temp = 1001;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) temp = 0;
            else { temp++;}
            answer[i] = temp;
        }
        temp = 1000;
        for (int i = str.length()-1 ; i >= 0; i--) {
            if(str.charAt(i) == ch) temp = 0;
            else{
                temp++;
                answer[i] = Math.min(answer[i], temp);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch = in.next().charAt(0);
        for (int x : T.solution(str, ch)) {
            System.out.print(x+" ");
        }
    }
}
