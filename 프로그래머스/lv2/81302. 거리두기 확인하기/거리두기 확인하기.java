import java.util.*;

class Solution {
    
    public int[] solution(String[][] places) {
        int len = places.length;
        int[] answer = new int[len];
        
        for(int i=0; i<5; i++){
            answer[i] = 1;
            for(int j=0; j<5; j++){
                for(int k=0; k<5; k++){
                    if(places[i][j].charAt(k) == 'P') {
                        if(isValid(places[i], j, k)==0){
                            answer[i] = 0; 
                            break;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    
    public int isValid(String[] arr, int x, int y){
        
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] dir: dirs){
            int newX = x+dir[0];
            int newY = y+dir[1];
            if(newX>=0 && newX<5 && newY>=0 && newY<5 && arr[newX].charAt(newY)=='P') return 0;
        }
        
        int[][] dirs2 = {{0,2},{0,-2},{2,0},{-2,0}};
        for(int[] dir: dirs2){
            int newX = x+dir[0];
            int newY = y+dir[1];
            if(newX>=0 && newX<5 && newY>=0 && newY<5 && arr[newX].charAt(newY)=='P') {
                if(arr[(newX+x)/2].charAt((newY+y)/2)!='X') return 0;
            }
        }
        
        
        int[][] dirs3 = {{1,1},{-1,-1},{-1,1},{1,-1}};
        for(int[] dir: dirs3){ 
            int newX = x+dir[0];
            int newY = y+dir[1];
            if(newX>=0 && newX<5 && newY>=0 && newY<5 && arr[newX].charAt(newY)=='P') {
                if(arr[x].charAt(newY)!='X' || arr[newX].charAt(y)!='X') return 0;
            }
        }
        
        return 1;
    }
}