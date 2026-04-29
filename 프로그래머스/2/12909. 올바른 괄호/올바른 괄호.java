import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Deque<Character>que = new ArrayDeque<>();
        boolean answer = false;
        
        for(int i = 0; i < s.length(); i++) {
            Character cur = s.charAt(i);
            
            if (cur == '('){
                que.offerFirst(cur);
                
            } else {
                if (que.isEmpty()) {
                    return answer;
                }
                Character peek = que.peekFirst();
                
                if (peek == ')') {
                    return answer;
                } else {
                    que.pollFirst();
                }
            }
            
        }
        if (que.isEmpty()) {
            answer = true;
        }
        return answer;
    }
}