import java.util.*;

class Solution {
    public int solution(int[] toppings) {
        int answer = 0;
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        for(int topping: toppings) {
            a.put(topping, a.getOrDefault(topping, 0)+1);
        }
        
        for(int i=0; i<toppings.length; i++) {
            int topping = toppings[i];
            a.put(topping, a.get(topping)-1);
            if(a.get(topping) == 0) a.remove(topping);
            b.put(topping, a.getOrDefault(topping, 0)+1);
            if(a.size() == b.size()) answer++;
        }
        
        return answer;
    }
}