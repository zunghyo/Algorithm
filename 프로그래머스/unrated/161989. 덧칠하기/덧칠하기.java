import java.util.*;

class Solution {
    public int solution(int n, int m, int[] sections) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int section: sections){
            q.offer(section);
        }
        
        while(!q.isEmpty()){
            int section = q.poll();
            int max = section+m;
            int counter = section+1;
            
            while(!q.isEmpty() && counter < max){
                if(q.peek()==counter) q.poll();
                counter++;
            }
            answer++;
        }
        
        return answer;
    }
}