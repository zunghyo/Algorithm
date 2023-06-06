class Solution {
    public String solution(String m, String[] musicinfos) {
        m = m.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
        String answer = "(None)";
        int maxRecord = Integer.MIN_VALUE;
        
        for(String musicinfo: musicinfos) {
            String[] info = musicinfo.split(",");
            int startTiem = Integer.parseInt(info[0].split(":")[0])*60 + Integer.parseInt(info[0].split(":")[1]);
            int endTime = Integer.parseInt(info[1].split(":")[0])*60 + Integer.parseInt(info[1].split(":")[1]);
            int playTime = endTime - startTiem;
            String title = info[2];
            String record = info[3].replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < playTime; i++) {
                sb.append(record.charAt(i % record.length()));
            }
            record = sb.toString();
            
            int location = record.indexOf(m);
            if(location > -1 && record.length() > maxRecord){
                answer = title;
                maxRecord = record.length();
            }
        }
        return answer;
    }
}