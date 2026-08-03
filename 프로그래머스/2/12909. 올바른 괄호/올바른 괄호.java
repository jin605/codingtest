import java.util.Deque;
import java.util.ArrayDeque;


class Solution {
    boolean solution(String s) {
        
        Deque <Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            
            if (cur == '(') {
                stack.offerFirst(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pollFirst();
            }
        }
        
        return stack.isEmpty();
    }
}