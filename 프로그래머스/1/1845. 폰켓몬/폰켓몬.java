import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> pkms = new HashMap<>();
        
        for (int pkm : nums) {
            
            pkms.put(pkm, pkms.getOrDefault(pkm,0) + 1);
        }
        
        if (nums.length/2 > pkms.size()) {
            
            return pkms.size();
        } else {
            return (nums.length)/2;
        }
    }
}