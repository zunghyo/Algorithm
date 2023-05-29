import java.util.*;
class Solution {
    String[] list = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for(String temp: babbling){
            for(String str: list){
                if(temp.indexOf(str+str)>-1) continue;
                temp = temp.replace(str, "*");
            }
            temp = temp.replace("*", "");
            if("".equals(temp)) answer++;
        }
        return answer;
    }
}