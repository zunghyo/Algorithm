import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> Q = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            int[] temp = new int[]{i, priorities[i]};
            Q.offer(temp);
        } 
        
        while(!Q.isEmpty()){
            int[] temp = Q.poll();
            boolean check = true;
            for(int[] q: Q){
                if(q[1] > temp[1]) {
                    check = false;
                    break;
                }
            }
            
            if(!check) Q.offer(temp);
            else {
                answer++;
                if(temp[0] == location) break;
            }
        }
        
        return answer;
    }
}