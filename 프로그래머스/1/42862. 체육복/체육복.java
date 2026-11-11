import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n - lost.length;
        boolean[] used = new boolean[n+1];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    used[reserve[j]] = true;
                    answer++;
                    break;
                    
                }
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            
            if (lost[i] == -1) continue;
            
            for (int j = 0; j < reserve.length; j++) {
                
                if (!used[reserve[j]]) {
                    
                    if (lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                        used[reserve[j]] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}