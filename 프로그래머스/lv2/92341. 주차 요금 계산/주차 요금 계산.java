import java.util.*;

class Solution {
    public long[] solution(int[] fees, String[] records) {
        Map<String, Integer> carIn = new HashMap<>();
        Map<String, Integer> carTime = new TreeMap<>();
        
        for(String record: records) {
            String timeStr = record.split(" ")[0];
            int time = Integer.parseInt(timeStr.split(":")[0])*60 + Integer.parseInt(timeStr.split(":")[1]);
            String carNumber = record.split(" ")[1];
            String carInOut = record.split(" ")[2];
            
            
            if("IN".equals(carInOut)){
                carIn.put(carNumber, time);
            } else {
                int parkingTime = time-carIn.get(carNumber);
                carIn.remove(carNumber);
                carTime.put(carNumber, carTime.getOrDefault(carNumber, 0) + parkingTime);
            }
        }
        
        
        for(String carNumber: carIn.keySet()) {
            int parkingTime = 1439-carIn.get(carNumber);
            carTime.put(carNumber, carTime.getOrDefault(carNumber, 0) + parkingTime);
        }
        
        long[] answer = new long[carTime.size()];
        int i = 0;
        int defaultTime = fees[0];
        int defaultPrice = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];
        
        for(String carNumber: carTime.keySet()) {
            int parkingTime = carTime.get(carNumber);
            
            answer[i] += defaultPrice;
            if(parkingTime > defaultTime) {
                int overTime = parkingTime - defaultTime;
                answer[i] += Math.ceil((double) overTime / unitTime) * unitPrice;
            }
            i++;
        }
        
        return answer;
    }
}