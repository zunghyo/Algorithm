import java.util.*;
class Solution {
    public int solution(String[][] bookTimes) {
        int answer = Integer.MIN_VALUE;
        Arrays.sort(bookTimes, (a, b) -> a[0].compareTo(b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(String[] bookTime: bookTimes) {
            int startTime = Integer.parseInt(bookTime[0].split(":")[0])*60 
                          + Integer.parseInt(bookTime[0].split(":")[1]);
            int endTime = Integer.parseInt(bookTime[1].split(":")[0])*60 
                        + Integer.parseInt(bookTime[1].split(":")[1])+10 ;
            
            while(!pq.isEmpty() && pq.peek()<=startTime){
                pq.poll();
            }
            pq.offer(endTime);
            
            answer = Math.max(answer, pq.size());
        }
        
        return answer;
    }
}