import java.util.*;
    
class Solution {
    public int solution(int[] citations) {
        
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i : citations) {
            
            list.add(i);
        }
        
        list.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            
            int cur = list.get(i); // 현재 논문의 인용수
            
            if (cur >= i+1) {
                
                answer = i+1;
                
            } else {
                return answer;
            }
                
        }
        
        return answer;
        
    }
        
}
