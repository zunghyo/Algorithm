class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int pCnt=0, yCnt=0;
        
        for(char x: s.toCharArray()){
            if(x=='P') pCnt++;
            else if(x=='Y') yCnt++;
        }

        return pCnt==yCnt? true: false;
    }
}