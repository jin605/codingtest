import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String, Integer> combi = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            
            combi.put(clothes[i][1], combi.getOrDefault(clothes[i][1],0) +1);
            
        }
        
        int multi = 1;
        
        for (Map.Entry <String, Integer> map : combi.entrySet()) {
            multi *= (map.getValue()+1);
        }
        
        return multi-1;
        
    }
}