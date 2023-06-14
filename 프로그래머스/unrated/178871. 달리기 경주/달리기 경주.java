import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        Map<Integer, String> playersLank = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            playersMap.put(players[i], i);
            playersLank.put(i, players[i]);
        }
        
        for(String callingName: callings){
            int callingLank = playersMap.get(callingName);
            if(callingLank > 0){
                int prevPlayerLank = callingLank-1;
                String prevPlayerName = playersLank.get(prevPlayerLank);

                playersLank.put(prevPlayerLank, callingName);
                playersLank.put(callingLank, prevPlayerName);
                playersMap.put(prevPlayerName, callingLank);
                playersMap.put(callingName, prevPlayerLank);
                
            }

        }
        
        String[] answer = new String[players.length];
        int i =0;
        for(int lank: playersLank.keySet()){
            answer[i++] = playersLank.get(lank);
        }

        return answer;
    }
}