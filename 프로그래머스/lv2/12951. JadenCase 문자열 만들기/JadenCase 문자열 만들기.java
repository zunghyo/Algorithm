class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] temp = s.toCharArray();
        
        temp[0] = Character.toUpperCase(temp[0]);
        for(int i=1; i<temp.length-1; i++){
            if(temp[i]==' ' && Character.isLetter(temp[i+1])) {
                temp[i+1] = Character.toUpperCase(temp[i+1]);
            }
        }
        
        return new String(temp);
    }
}