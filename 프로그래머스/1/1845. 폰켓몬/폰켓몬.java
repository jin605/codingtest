import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        int answer = Math.min(map.size(), nums.length/2);
        
        
        return answer;
    }
}