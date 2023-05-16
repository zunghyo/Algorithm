class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int height=3; height<brown+yellow; height++){
            int width = (brown+yellow)/height;
            if(width>=height){
                if((width-2)*(height-2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        return answer;
    }
}