class Solution {
    
    boolean[] visited;
    int count;
    int[][] wires;
    
    
    public int solution(int n, int[][] wires) {
        
        this.wires = wires;
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
            
            visited = new boolean[n+1];
            count = 0;
            
            dfs(1, i);
            
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
            
        }
        
        return answer;
    }
    
    void dfs(int node, int skip) {
        
        visited[node] = true;
        count++;
        
        for (int j = 0; j < wires.length; j++) {
            if (j == skip) continue;
            
            int a = wires[j][0];
            int b = wires[j][1];
            
            if (a == node && !visited[b]) {
                dfs(b, skip);
            }
            
            if (b == node && !visited[a]) {
                dfs(a,skip);
            }
            
        }
    }
}
