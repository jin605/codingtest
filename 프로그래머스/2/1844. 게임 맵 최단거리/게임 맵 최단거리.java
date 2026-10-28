import java.util.ArrayDeque;

class Solution {
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    int[][] maps;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        
        this.maps = maps;
        
        ArrayDeque<Point> que = new ArrayDeque<>();
        visited = new boolean[maps.length][maps[0].length];
        
        que.offerLast(new Point(0,0,1));
        visited[0][0] = true;
        int answer = -1;
        
        while(!que.isEmpty()) {
            
            
            Point cur = que.pollFirst();
            int x = cur.x;
            int y = cur.y;
            int dist = cur.dist;
            
            if (x == maps.length-1 && y == maps[0].length-1) return dist;
            
            for (int i = 0; i < dx.length; i++) {
                
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0]. length) continue;
                
                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    
                    que.offerLast(new Point(nx,ny,dist+1));
                    visited[nx][ny] = true;
                }
            }
        }
        return answer;
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
}