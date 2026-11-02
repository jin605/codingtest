import java.util.ArrayDeque;

class Solution {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    boolean[][] visited;
    int count;
    
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
        ArrayDeque<Pair> que = new ArrayDeque<>();
        int answer = Integer.MAX_VALUE;
        
        
        int[][] map = new int [101][101];
        visited = new boolean[101][101];
        
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = rectangle[i][0]*2; j <= rectangle[i][2]*2; j++) {
                for (int k = rectangle[i][1]*2; k <= rectangle[i][3]*2; k++) {
                    
                    map[j][k] = 1;
                    
                }
            }
        }
        
        for (int a = 0; a < rectangle.length; a++) {
            for (int b = rectangle[a][0]*2+1; b < rectangle[a][2]*2; b++) {
                for (int c = rectangle[a][1]*2+1; c < rectangle[a][3]*2; c++) {
                    
                    map[b][c] = 0;
                    
                }
            }
        }
        
        que.offerLast(new Pair(characterX*2,characterY*2,0));
        visited[characterX*2][characterY*2] = true;
        
        while(!que.isEmpty()) {
            
            Pair cur = que.pollFirst();
            int x = cur.x;
            int y = cur.y;
            int dist = cur.dist;
            
            for (int m = 0; m < dx.length; m++) {
                int nx = x + dx[m];
                int ny = y + dy[m];
                
                if (x == itemX * 2 && y == itemY * 2) {
                    return dist/2;
                }
                
                
                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
            
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    
                
                    que.offerLast(new Pair(nx,ny,dist+1));
                    visited[nx][ny] = true;
                    count ++;
                }
            }  
        }
        
        return answer/2;
        
    }
}

class Pair {
    
    int x;
    int y;
    int dist;
    
    Pair (int x, int y, int dist) {
        
        this.x = x;
        this.y = y;
        this.dist = dist;
        
    }
}