import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {

        ArrayDeque<Character> stk = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            if (target == '(') {
                stk.push(target);

            } else {

                if (stk.isEmpty() || stk.peekFirst() == ')') {
                    return false;
                } else stk.pop();
            }

        }

        if (stk.isEmpty()) {
            return true;
        } else return false;


    }
}