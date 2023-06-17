import java.util.*;

class Solution {
    Set<String> wordSet = new HashSet<>();
    
    static String[] words = new String[]{"aya", "ye", "woo", "ma"};
    static boolean[] visited = new boolean[words.length];
    
    public int solution(String[] babblings) {
        
        dfs(0, "", words);
        
        int answer = 0;
        for(String babbling: babblings) {
            if(wordSet.contains(babbling)) answer++;
        }
        
        return answer;
    }
    
    public void dfs(int x, String result, String[] words) {
        wordSet.add(result);
        //System.out.println(result);
        for(int i=0; i<words.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i+1, result+words[i], words);
                visited[i] = false;
            }
        }
    }
}