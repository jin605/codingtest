import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayDeque <Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            if (queue.isEmpty() || queue.peek() != target) {
                queue.push(target);
            }
        }
        int[] answer = new int[queue.size()];
        int j = queue.size()-1; 
        for (int num : queue) {
            answer[j] = num;
            j--;
        }
        
        return answer;
    }
}