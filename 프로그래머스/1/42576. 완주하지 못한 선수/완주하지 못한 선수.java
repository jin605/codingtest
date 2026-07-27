import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            map.put(name, map.get(name) -1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                
                return entry.getKey();
            }
        }
        
        return "";
    }
        
}