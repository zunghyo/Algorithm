class Solution {
    public String solution(int[] foods) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<foods.length; i++) {
            int cnt = foods[i]/2;
            if(cnt > 0){
                for(int j=0; j<cnt; j++) sb.append(i);
            }
        }
        return sb.toString() + "0" + sb.reverse().toString();
    }
}