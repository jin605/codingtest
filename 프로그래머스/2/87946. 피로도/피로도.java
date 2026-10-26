class Solution {
    
    int count;
    int answer;
    boolean[] visited;
    int[][] dungeons;
    
    public int solution(int k, int[][] dungeons) {
        
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        dfs(k,count);
        
        return answer;
    }
    
    void dfs(int k, int count) {
        
        answer = Math.max(count,answer);
        
        for(int i = 0; i < dungeons.length; i++) {
            
            if (!visited[i] && k >= dungeons[i][0]) {
                
                visited[i] = true;
                dfs(k - dungeons[i][1], count + 1);
                visited[i] = false;
                
            }
            
            
            
        }
    }
}