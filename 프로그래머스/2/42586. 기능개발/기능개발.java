import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answerList = new ArrayList<>();
        int idx = 0;
        
        while(idx < progresses.length) {
            
            for (int i = idx; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
            
            int count = 0 ;
            
            while (idx < progresses.length && progresses[idx] >= 100) {
                
                idx++;
                count++;
                
            }
            
            if (count > 0 ) {
                answerList.add(count);
            }
            
            
        }
        int answer[] = new int[answerList.size()];
        
        for (int i = 0 ; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}