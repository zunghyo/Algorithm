import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int x: scoville){
            heap.offer(x);
        }
        
        while(heap.peek() < K){
            if(heap.size() < 2) return -1;
            int temp = heap.poll() + heap.poll()*2;
            heap.offer(temp);
            answer++;
        }
        
        return answer;
    }
}