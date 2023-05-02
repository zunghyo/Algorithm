import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();;
        str2 = str2.toUpperCase();
        Map<String, Integer> map1 = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        Set<String> set = new HashSet();
        
        for(int i=0; i< str1.length()-1; i++){
            String temp = str1.substring(i,i+2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map1.put(temp, map1.getOrDefault(temp,0)+1);
                set.add(temp);
            }
        }
        for(int i=0; i< str2.length()-1; i++){
            String temp = str2.substring(i,i+2);
            if(Character.isAlphabetic(temp.charAt(0)) && Character.isAlphabetic(temp.charAt(1))){
                map2.put(temp, map2.getOrDefault(temp,0)+1);
                set.add(temp);
            }
        }
        
        int total = 0;
        for(String temp: set){
            total += Math.max(map1.getOrDefault(temp,0), map2.getOrDefault(temp,0));
        }
        
        for(String temp: map1.keySet()){
            if(map2.containsKey(temp)){
                answer += Math.min(map1.get(temp), map2.get(temp));
            }
        } 
        
        if(total == 0) answer = 65536;
        else answer = answer * 65536 / total;
        
        return answer;
    }
}