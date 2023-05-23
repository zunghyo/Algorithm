import java.util.*;

class Solution {
    List<String> list = new ArrayList<>();
    int cnt = 0;
    
    public int solution(String word) {
        char[] alphabets = {'A', 'E', 'I', 'O', 'U'};
        dfs(0, "", alphabets);
        return list.indexOf(word);
    }
    
    public void dfs(int L, String word, char[] alphabets){
        list.add(word);
        if(L < 5){
            for(char c: alphabets){
                dfs(L+1, word+c, alphabets);
            }
        }
        
    }
}