class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int gcd = getGcd(n, m);
        int lcm = n * m / gcd;
        
        return new int[]{gcd, lcm};
    }
    
    public int getGcd(int a, int b) {
        int r = 1;
        while(r > 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}