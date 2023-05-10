import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0; 
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        
        for(char dir: dirs.toCharArray()){
            String prevPos = Integer.toString(x) + Integer.toString(y);
            
            if(dir=='U' && x<5) x+=1;
            else if(dir=='D' && x>-5) x-=1;
            else if(dir=='R' && y<5) y+=1;
            else if(dir=='L' && y>-5) y-=1;
            
            String pos = Integer.toString(x) + Integer.toString(y);
            if(!prevPos.equals(pos)) {
                set.add(prevPos + pos);
                set.add(pos + prevPos);
            }
            
        }
        
        answer = set.size()/2;
        return answer;
    }
}