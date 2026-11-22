import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;


class Solution {
    public int solution(int n, int[][] edge) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] value : edge) {
            graph.get(value[0]).add(value[1]);
            graph.get(value[1]).add(value[0]);
        }
        
        int[] dist = new int[n+1];
        Arrays.fill(dist,-1);
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(1);
        dist[1] = 0;
        
        while(!queue.isEmpty()) {
            int cur = queue.pollFirst();
            
            for (int next : graph.get(cur)) {
                
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    queue.offerLast(next);
                }
            }
        }
        
        int max = 0;
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }
        
        for (int i = 1; i <= n; i++) {
            if (dist[i] == max) {
                answer++;
            }
        }
        
        
        
        return answer;
    }
}