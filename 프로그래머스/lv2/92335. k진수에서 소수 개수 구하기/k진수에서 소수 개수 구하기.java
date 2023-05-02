import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%k);
            n = n/k;
        }
        String str = sb.reverse().toString();
        
        if(str.isEmpty()) return 0;
        
        String[] arr = str.split("0");
        for(String x: arr){
            if(!x.isEmpty()){
                long num = Long.parseLong(x);
                boolean isPrime = true;
                if(num < 2) isPrime = false;
                for(int i=2; i<=Math.sqrt(num); i++){
                    if(num%i == 0){
                        isPrime = false; 
                        break;
                    }
                }
                if(isPrime) answer++;
            }
        }
        
        return answer;
    }
}