import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int element: arr) {
            if(element%divisor==0) list.add(element);
        }
        if(list.isEmpty()) list.add(-1);
        
        int[] answer = new int[list.size()];
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}