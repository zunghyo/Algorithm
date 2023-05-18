import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int answer = 1;
        int max = routes[0][1];
        for(int i=1; i<routes.length; i++){
            if(routes[i][0]>max) {
                answer++;
                max = routes[i][1];
            }
        }
        return answer;
    }
}