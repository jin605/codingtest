import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        Deque <Character> queue = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char cur = s.charAt(i);
            if (s.charAt(0) == ')') {
                return false;
            }
            if (cur == '(') {
                queue.offerFirst(cur);
                
            } else {
                queue.pollFirst();
            }
        }
        
        if (queue.isEmpty()) {
            return true;
        }

        return answer;
    }
}