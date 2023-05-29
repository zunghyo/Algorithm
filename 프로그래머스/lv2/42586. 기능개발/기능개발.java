import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            int date = 100-progresses[i];
            if(date%speeds[i]==0) date = date/speeds[i];
            else date = date/speeds[i] +1;
            
            int cnt = 0;
            while(!Q.isEmpty() && Q.peek()<date){
                Q.poll();
                cnt++;
            }
            if(cnt>0) list.add(cnt);
            Q.offer(date);
        }
        if(!Q.isEmpty()) list.add(Q.size());
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}