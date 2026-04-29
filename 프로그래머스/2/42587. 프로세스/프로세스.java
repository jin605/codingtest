import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int q : priorities) {
            pq.offer(q);
        }
        
        int answer = 0;
        while(!pq.isEmpty()) {
            
            for (int i = 0; i < priorities.length; i++) {
                
                int cur = pq.peek();
                if (cur == priorities[i]) {
                    pq.poll();
                    answer++;
                    
                    if (location == i) {
                        return answer;
                    }
                }
            }
            
        }
        
        return answer;
    }
}