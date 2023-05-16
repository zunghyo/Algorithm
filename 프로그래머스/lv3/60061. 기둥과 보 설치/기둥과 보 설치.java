import java.util.*;

class Solution {
    private boolean[][] pillars, beams;

    public int[][] solution(int n, int[][] build_frame) {
        pillars = new boolean[n+3][n+3];
        beams = new boolean[n+3][n+3];

        for(int[] frame : build_frame) {
            int x = frame[0] + 1;
            int y = frame[1] + 1;
            int a = frame[2];
            int b = frame[3];

            if(b == 0) { // 삭제하는 경우
                if(a == 0) pillars[x][y] = false; // 기둥 삭제
                else beams[x][y] = false; // 보 삭제

                if(!check(x, y, a)) { 
                    if(a == 0) pillars[x][y] = true;
                    else beams[x][y] = true;
                }
            } else { // 설치하는 경우
                if(a == 0 && (y == 1 || pillars[x][y-1] || beams[x-1][y] || beams[x][y])) pillars[x][y] = true;
                else if(a == 1 && ((pillars[x][y-1] || pillars[x+1][y-1]) || (beams[x-1][y] && beams[x+1][y]))) beams[x][y] = true;
            }
        }
        List<int[]> result = new ArrayList<>();
        for(int i=1; i<=n+1; i++) {
            for(int j=1; j<=n+1; j++) {
                if(pillars[i][j]) result.add(new int[] {i-1, j-1, 0});
                if(beams[i][j]) result.add(new int[] {i-1, j-1, 1});
            }
        }

        return result.toArray(new int[result.size()][3]);
    }
    
    
    private boolean check(int x, int y, int a) {
        for(int dx=-1; dx<=1; dx++) {
            for(int dy=-1; dy<=1; dy++) {
                if(pillars[x+dx][y+dy] && !isPossibleP(x+dx, y+dy)) return false;
                if(beams[x+dx][y+dy] && !isPossibleB(x+dx, y+dy)) return false;
            }
        }
        return true;
    }

    private boolean isPossibleP(int x, int y) {
        return y == 1 || pillars[x][y-1] || beams[x-1][y] || beams[x][y];
    }

    private boolean isPossibleB(int x, int y) {
        return (pillars[x][y-1] || pillars[x+1][y-1]) || (beams[x-1][y] && beams[x+1][y]);
    }
}