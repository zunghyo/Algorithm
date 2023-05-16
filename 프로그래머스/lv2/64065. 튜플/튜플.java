import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2).replace("},{","-");
        String[] arr = s.split("-");
        Arrays.sort(arr, (a, b) -> a.length()-b.length());
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String[] temp = arr[i].split(",");
            for(String x: temp){
                if(!list.contains(x)) list.add(x);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}