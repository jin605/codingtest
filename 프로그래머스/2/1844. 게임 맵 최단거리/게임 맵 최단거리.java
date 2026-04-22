import java.util.*;

class Solution {
    // x를 행(row), y를 열(column)로 통일해서 생각합시다.
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};
    
    private static class Pair {
        int r, c;
        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;    // 세로 길이 (행)
        int m = maps[0].length; // 가로 길이 (열)
        
        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(vis[i], -1);
        }
        
        // Deque는 ArrayDeque가 가장 빠르고 안정적입니다.
        Queue<Pair> q = new ArrayDeque<>();
        
        vis[0][0] = 1; 
        q.offer(new Pair(0, 0));
        
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];
                
                // 1. 범위 체크 (n, m 기준 확인)
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                // 2. 벽 체크 및 방문 여부 체크
                if (maps[nr][nc] == 0 || vis[nr][nc] != -1) continue;
                
                vis[nr][nc] = vis[cur.r][cur.c] + 1;
                q.offer(new Pair(nr, nc));
            }
        }
        
        // 최종 목적지 (n-1, m-1) 리턴
        return vis[n - 1][m - 1];
    }
}