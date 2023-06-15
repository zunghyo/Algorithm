import java.util.*;

class Solution {
    public int solution(int bridgeLength, int bridgeMaxWeight, int[] truckWeights) {
        Queue<Truck> bridge = new LinkedList<>();
        int time = 0;
        int bridgeSumWeight = 0;
        
        int i = 0;
        while(i < truckWeights.length) {
            time++;
            
            if(!bridge.isEmpty() && time-bridge.peek().time == bridgeLength) {
                bridgeSumWeight -= bridge.poll().weight;
            }
            if(bridge.size() == bridgeLength) {
                continue;
            }
            if(bridgeSumWeight+truckWeights[i] > bridgeMaxWeight) {
                continue;
            }
            
            bridge.offer(new Truck(truckWeights[i], time));
            bridgeSumWeight += truckWeights[i];
            i++;
        }
        
        return time+bridgeLength;
    }
}

class Truck {
    int weight;
    int time;
    
    public Truck(int weight, int time){
        this.weight = weight;
        this.time = time;
    }
}