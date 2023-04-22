package lecture.chapter04_hashmap_treeset.Quiz4_모든아나그램찾기;

import java.util.*;

public class Main {

    public int solution(String strA, String strB){
        int answer = 0;
        int lt = 0;
        Map<Character, Integer> mapA = new HashMap();
        Map<Character, Integer> mapB = new HashMap();
        int lenB = strB.length() - 1;
        for (int i = 0; i < lenB; i++) mapA.put(strA.charAt(i), mapA.getOrDefault(strA.charAt(i), 0) + 1);
        for (char x: strB.toCharArray()) mapB.put(x, mapB.getOrDefault(x, 0) + 1);

        for (int rt = lenB; rt < strA.length(); rt++) {
            mapA.put(strA.charAt(rt), mapA.getOrDefault(strA.charAt(rt), 0) + 1);
            if(mapA.equals(mapB)) answer++;
            mapA.put(strA.charAt(lt), mapA.get(strA.charAt(lt)) - 1);
            if(mapA.get(strA.charAt(lt)) == 0) mapA.remove(strA.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String strA = in.next();
        String strB = in.next();
        System.out.println(T.solution(strA, strB));
    }
}
