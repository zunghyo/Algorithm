import java.util.*;
class Solution {
    public int solution(int[] ingredients) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int ingredient: ingredients) {
            stack.push(ingredient);
            
            int stackSize = stack.size();
            if(stackSize >= 4) {
                if(stack.get(stackSize-4) == 1 
                   && stack.get(stackSize-3) == 2
                   && stack.get(stackSize-2) == 3
                   && stack.get(stackSize-1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}