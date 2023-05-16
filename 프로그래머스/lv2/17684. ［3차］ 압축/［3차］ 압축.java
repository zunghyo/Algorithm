import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            dictionary.put(String.valueOf(ch), i + 1);
        }

        int idx = 27;
        int start = 0;
        int end = 0;

        while (end < msg.length()) {
            end++;
            String current = msg.substring(start, end);

            if (!dictionary.containsKey(current)) {
                result.add(dictionary.get(msg.substring(start, end - 1)));
                dictionary.put(current, idx++);
                start = end - 1;
            }
        }
        result.add(dictionary.get(msg.substring(start, end)));

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}