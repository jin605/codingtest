import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            
            map.put(player, map.getOrDefault(player,0) + 1);
        }
        
        for (String player : completion) {
            
            map.put(player, map.getOrDefault(player,0) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            
            if (entry.getValue() >= 1) {
                return entry.getKey();
            }
        }
        
        
        String answer = "";
        return answer;
    }
}