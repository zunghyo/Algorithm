import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        int[] arr = new int[n+n-1];
        for(int i=0; i< n; i++) arr[i] = elements[i];
        for(int i=n; i< arr.length; i++) arr[i] = elements[i-n];
        
        Set<Integer> set = new HashSet();
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int x=i; x<i+n; x++){
                sum += arr[x];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}