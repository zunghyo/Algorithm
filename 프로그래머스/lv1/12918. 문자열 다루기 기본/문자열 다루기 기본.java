class Solution {
    public boolean solution(String s) {
        char[] chars = s.toCharArray();
        if(chars.length!=4 && chars.length!=6) return false;
        for(char ch: chars){
            if(!Character.isDigit(ch)) return false;
        }
        return true;
    }
}