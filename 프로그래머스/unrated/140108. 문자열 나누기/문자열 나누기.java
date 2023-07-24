class Solution {
    public int solution(String s) {
        int count = 1;
        
        char firstCharacter = s.charAt(0);
        int matchCount = 0;
        int notMatchCount = 0;
        
        for(char current : s.toCharArray()) {
            
            if (matchCount == notMatchCount && matchCount != 0) {
                count++;
                firstCharacter = current;
                matchCount = 0;
                notMatchCount = 0;
            }
            
            if (firstCharacter == current) {
                matchCount++;
            } else {
                notMatchCount++;
            }
        }
        
        return count;
    }
}