class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int divisorCount = countDivisors(i);
            answer += (divisorCount > limit) ? power : divisorCount;
        }
        
        return answer;
    }
    
    public int countDivisors(int number) {
        int count = 0;
        int sqrt = (int) Math.sqrt(number);
        
        for(int i = 1; i <= sqrt; i++) {
            if(number % i == 0) {
                count += (i == number / i) ? 1 : 2;
            }
        }
        
        return count;
    }
}