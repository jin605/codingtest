import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Deque <Integer> que = new ArrayDeque<>();
        
        for(int i = 0; i <bridge_length; i++) {
            que.offerLast(0);
        }
        
        int time = 0;
        int curWeight = 0;
        int truckIdx = 0;
        
        while (!que.isEmpty()) {
            
            time ++;
            curWeight -= que.pollFirst();
            
            if (truckIdx < truck_weights.length) {
                
                int curtruck = truck_weights[truckIdx];
                
                if (curWeight + curtruck <= weight) {
                    
                    curWeight += curtruck;
                    que.offerLast(curtruck);
                    truckIdx++;
                    
                } else {
                    que.offerLast(0);
                }
            }
            
        }
           
        int answer = time;
        return answer;
    }
}
