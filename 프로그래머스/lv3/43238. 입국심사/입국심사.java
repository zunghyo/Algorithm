import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long maxTime = 0;
        for(int time: times){
            maxTime = Math.max(maxTime, time);
        }
        long left = 0;
        long right = maxTime * n;
        long mid = 0;
        long answer = right;
        while(left<=right){
            long people = 0;
            mid = (left+right)/2;
            
            for(int time: times){
                people += mid/time;
            }
            if(people < n){
                left = mid + 1;
            }else{
                if(mid <= answer) {
                    answer = mid;
                }
                right = mid - 1;
            }
        }
        
        return answer;
    }
}