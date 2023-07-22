import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[4];
        int max = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(person1[i % person1.length] == answers[i]) {
                count[1]++;
                max = Math.max(max, count[1]);
            }
            if(person2[i % person2.length] == answers[i])  {
                count[2]++;
                max = Math.max(max, count[2]);
            }
            if(person3[i % person3.length] == answers[i])  {
                count[3]++;
                max = Math.max(max, count[3]);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < count.length; i++) {
            if(count[i] == max) result.add(i);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}