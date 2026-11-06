import java.util.ArrayDeque;

class Solution {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int[][] maps;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length];
        ArrayDeque <Point> que = new ArrayDeque<>();
        int answer = -1;
        
        que.offerLast(new Point(0,0,1));
        visited[0][0] = true;
        
        while (!que.isEmpty()) {
            
            Point cur = que.pollFirst();
            int x = cur.x;
            int y = cur.y;
            int dist = cur.dist;
            
            if (x == maps.length-1 && y == maps[0].length-1) {
                return dist;
            }
            
            for (int i = 0; i < dx.length; i++) {
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >=maps[0].length) continue;
                
                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    
                    visited[nx][ny] = true;
                    que.offerLast(new Point(nx,ny,dist+1));
                }
            }
        }
        
        return answer;
        
    }
}

class Point {
    
    int x;
    int y;
    int dist;
    
    Point (int x, int y, int dist) {
        
        this.x = x;
        this.y = y;
        this.dist = dist;
        
    }
}