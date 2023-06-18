class Solution {
    public int solution(int price) {
        double result = price;
        
        if(price >= 500000) result = price * 0.8;
        else if(price >= 300000) result = price * 0.9;
        else if(price >= 100000) result =  price * 0.95;
        
        return (int) result;
    }
}