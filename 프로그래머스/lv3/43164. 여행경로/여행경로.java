import java.util.*;

class Solution {
    ArrayList<String> routes = new ArrayList<>();
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visited = new boolean[tickets.length];

        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(routes);
        
        answer = routes.get(0).split(" ");
        
        return answer;
    }
    
    public void dfs(int L, String start, String route, String[][] tickets){
        if(L == tickets.length){
            routes.add(route);
            return;
        } else{
            for(int i=0; i<tickets.length; i++){
                if(visited[i]==false && start.equals(tickets[i][0])){
                    visited[i] = true;
                    dfs(L+1, tickets[i][1], route+" "+tickets[i][1], tickets);
                    visited[i] = false;
                }
            }
        }
    }
}