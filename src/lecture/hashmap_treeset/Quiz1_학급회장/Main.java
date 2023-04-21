package lecture.hashmap_treeset.Quiz1_학급회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public Character solution(int n, String str){
        Character answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(str.charAt(i))) map.put(str.charAt(i), 1);
            else map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.print(T.solution(n, str));
    }
}
