class Solution {
    
    boolean[] visited;
    int[][] computers;
    int n;
    
    public int solution(int n, int[][] computers) {
        
        this.computers = computers;
        this.n = n;
        visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    void dfs(int index) {
        
        visited[index] = true;
        
        for (int i = 0; i < n; i++) {
            if (computers[index][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
