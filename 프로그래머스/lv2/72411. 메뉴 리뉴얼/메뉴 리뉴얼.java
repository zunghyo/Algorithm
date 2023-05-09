import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        
        for(int orderSize: course){
            Map<String, Integer> map = new HashMap<>();
            
            for(String order: orders){
                char[] orderArr = order.toCharArray();
                Arrays.sort(orderArr);
                DFS(orderArr, 0, orderSize,"", map);
            }
            
            if(!map.isEmpty()){
                int max = Collections.max(map.values());
                if(max >= 2){
                    for(Map.Entry<String, Integer> entry: map.entrySet()){
                        if(entry.getValue() == max) list.add(entry.getKey());
                    }
                }
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
    
    public void DFS(char[] arr, int i, int orderSize, String str, Map<String, Integer> map){
        if(str.length() == orderSize) {
            map.put(str, map.getOrDefault(str, 0)+1);
        } else{
            if(i < arr.length){
                DFS(arr, i+1, orderSize, str+arr[i], map);
                DFS(arr, i+1, orderSize, str, map);
            }
        }
    }
    
}