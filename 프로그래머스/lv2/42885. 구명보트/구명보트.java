import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int i = 0, j = people.length-1;
        while(i <= j){
            answer++;
            if(people[i]+people[j] <= limit) i++;
            j--;
        }
        return answer;
    }
}