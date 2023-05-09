class Solution {
    public int solution(int n) {
        int answer = 0;
        int nBitCount = Integer.bitCount(n);
        
        while(true){
            n++;
            if(Integer.bitCount(n) == nBitCount) return n;
        }
    }
}