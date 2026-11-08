import java.util.ArrayDeque;

class Solution {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        
        int[][] path = new int[101][101];
        ArrayDeque<Point> que = new ArrayDeque<>();
        
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = rectangle[i][0]*2; j <= rectangle[i][2]*2; j++) {
                for (int k = rectangle[i][1]*2; k <= rectangle[i][3]*2; k++) {
                    path[j][k] = 1;
                }
            }
        }
        
        for (int a = 0; a < rectangle.length; a++) {
            for (int b = rectangle[a][0]*2+1; b <= rectangle[a][2]*2-1; b++) {
                for (int c = rectangle[a][1]*2+1; c <= rectangle[a][3]*2-1; c++) {
                    path[b][c] = 0;
                }
            }
        }
        
        que.offerLast(new Point(characterX*2,characterY*2,0));
        
        while(!que.isEmpty()) {
            
            Point cur = que.pollFirst();
            int x = cur.x;
            int y = cur.y;
            int dist = cur.dist;
            path[x][y] = 0;
            
            
            if (x == itemX*2 && y == itemY*2) {
                return dist/2;
            }
            
            for (int m = 0; m < dx.length; m++) {
                int nx = x + dx[m];
                int ny = y + dy[m];
                
                if (nx < 0 || ny < 0 || nx >= 101 || ny >= 101) continue;
                
                if (path[nx][ny] == 1) {
                    que.offerLast(new Point(nx,ny,dist+1));
                }
            }
            
        }
        
        int answer = 0;
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