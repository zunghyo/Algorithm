import java.util.*;

class Solution {
    
    static int numbersLen;
    static boolean[] visited;
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        char[] numbersArr = numbers.toCharArray();
        numbersLen = numbersArr.length;
        visited = new boolean[numbersLen];
        
        dfs(-1, "", numbersArr);
        
        return set.size();
    }
    
    public void dfs(int depth, String result, char[] numbers) {
        if(depth == numbersLen) return;
        if(!"".equals(result) ){
            int resultInt = Integer.parseInt(result);
            if(resultInt > 1 && sosu(resultInt) && !set.contains(resultInt)) {
                set.add(resultInt);
            }
        }
        
        for(int i=0; i<numbersLen; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(depth+1, result+numbers[i], numbers);
                visited[i] = false;
            }
        }
    }
    
    public boolean sosu(int number) {
        int end = number / 2 + 1;
        for(int i=2; i<number; i++) {
            if(number%i == 0) return false;
        }
        return true;
    }
}