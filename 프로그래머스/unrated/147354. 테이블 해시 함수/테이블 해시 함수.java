import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        
        int index = col-1;
        Arrays.sort(data, (a, b) -> {
            if(a[index] == b[index]) return b[0] - a[0];
            else return a[index] - b[index];
        });
        
        int result = 0;
        for(int i=row_begin-1; i<row_end; i++) {
            int row = i+1;
            int sum = 0;
            for(int j=0; j<data[i].length; j++){
                sum += data[i][j]%row;
            }
            result = result ^ sum;
        }
        
        return result;
    }
}