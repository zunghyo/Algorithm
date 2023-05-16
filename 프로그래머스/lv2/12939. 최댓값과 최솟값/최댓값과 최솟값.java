class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[0]);
        
        for(int i=1; i<temp.length; i++) {
            int current = Integer.parseInt(temp[i]);
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        
        answer = min + " " + max;
        return answer;
    }
}