class Solution {
    public int solution(long num) {
        if(num==1) return 0;
        int answer = 0;
        while(num!=1 && answer<500){
            if(num%2==0) num = num/2;
            else num = (num*3)+1;
            answer++;
        }
        return answer<500? answer: -1;
    }
}