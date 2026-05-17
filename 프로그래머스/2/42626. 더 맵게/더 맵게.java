import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i : scoville) {
            pq.offer(i);
        }
        
        
        while (pq.peek() < K) {
            
            if (pq.size() < 2) {
                return -1;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            
            int result = first + (second * 2);
            
            pq.offer(result); 
            answer++;
        }
        if (pq.peek() == 0) {
            return -1;
        }

        return answer;
    }
}