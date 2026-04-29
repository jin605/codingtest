import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Deque <Integer> que = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            int cur = arr[i];
            if (que.isEmpty() || que.peekLast() != cur) {
                que.offerLast(cur);
            } 
            
        }
        
        int[] answer = new int[que.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = que.pollFirst();
        }
            
        return answer;
        
        
    }
}