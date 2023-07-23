import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strings, (a, b) -> (b + a).compareTo(a + b));
        
        if(strings[0].equals("0")) return "0";
        
        StringBuilder answer = new StringBuilder();
        for(String string: strings) {
            answer.append(string);
        }
        
        return answer.toString();
    }
}