class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goals) {
        int i = 0, j = 0;
        
        for(int x=0; x<goals.length; x++){
            if(i<cards1.length && goals[x].equals(cards1[i])) {
                i++;
                goals[x] = null;
            } else if(j<cards2.length && goals[x].equals(cards2[j])) {
                j++;
                goals[x] = null;
            }
        }
        
        for(String goal: goals) {
            if(goal != null) return "No";
        }
        
        return "Yes";
    }
}