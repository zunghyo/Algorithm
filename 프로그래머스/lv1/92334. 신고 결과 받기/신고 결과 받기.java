import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] reports, int k) {
        //유저별 신고한 유저ID 목록
        Map<String, Set<String>> reportsMap = new HashMap<>();
        //유저별 신고당한 횟수
        Map<String, Integer> reportCounts = new HashMap<>();
        
        for(String report: reports) {
            String fromId = report.split(" ")[0];
            String toId = report.split(" ")[1];
            
            reportsMap.putIfAbsent(toId, new HashSet<>());
            if(reportsMap.get(toId).add(fromId)){
                reportCounts.put(toId, reportCounts.getOrDefault(toId, 0)+1);
            }
        }
        
        //유저가 받을 메일 횟수
        Map<String, Integer> emailCounts = new HashMap<>();
        
        for(String reportedUser: reportsMap.keySet()){
            if(reportCounts.getOrDefault(reportedUser, 0) < k) continue;
            
            for(String reporter: reportsMap.get(reportedUser)){
                emailCounts.put(reporter, emailCounts.getOrDefault(reporter, 0) + 1);
            }
        }
        
        int[] result = new int[id_list.length];
        for(int i=0; i<id_list.length; i++) {
            result[i] = emailCounts.getOrDefault(id_list[i], 0);
        }
        
        return result;
    }
}
