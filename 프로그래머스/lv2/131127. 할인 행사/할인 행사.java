import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        for(int i=0; i<discount.length-10+1; i++){
            Map<String, Integer> temp = new HashMap<>();
            temp.putAll(map);
            
            for(int j=i; j<i+10; j++){
                if(!temp.containsKey(discount[j])) continue;
                else{
                    if(temp.get(discount[j]) == 1) temp.remove(discount[j]);
                    else temp.put(discount[j], temp.get(discount[j])-1);
                }
            }
            if(temp.size() == 0) answer++;
        }
        return answer;
    }
}