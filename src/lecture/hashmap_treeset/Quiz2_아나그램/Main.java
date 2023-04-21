package lecture.hashmap_treeset.Quiz2_아나그램;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public String solution(String strA, String strB){
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (char key: strA.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for (char key: strB.toCharArray()) {
            if (!map.containsKey(key) || map.get(key)==0) return "NO";
            map.put(key, map.get(key)-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String strA = in.next();
        String strB = in.next();
        System.out.print(T.solution(strA, strB));
    }
}
