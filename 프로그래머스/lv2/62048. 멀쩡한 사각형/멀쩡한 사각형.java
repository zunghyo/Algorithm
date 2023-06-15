class Solution {
    public long solution(int w, int h) {
        return (long) w*h - (w+h-gcd(w,h));
    }
    
    public int gcd(int a, int b){
        int r = 1;
        while(r > 0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}