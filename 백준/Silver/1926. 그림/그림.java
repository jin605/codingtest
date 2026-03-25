import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {

                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < m; j++) {

                if (board[i][j] != 1 || vis[i][j])continue;

                count++;
                vis[i][j] = true;
                Deque<Pair> que = new LinkedList<>();
                que.offerLast(new Pair(i,j));

                int curArea = 0;
                
                
                while (!que.isEmpty()) {
                    
                    Pair cur = que.pollFirst();
                    curArea++;
                    
                    for (int dir = 0; dir < 4; dir++) {

                        int nx = cur.x + dx[dir];
                        int ny = cur.y + dy[dir];
                        
                        if (nx < 0 || nx >=n || ny < 0 || ny >= m )continue;
                        if (board[nx][ny] != 1 || vis[nx][ny])continue;

                        vis[nx][ny] = true;
                        que.offerLast(new Pair(nx,ny));
                        
                    }
                }
                
                if (curArea > maxArea) maxArea = curArea;  
                
                

            }
        }

        System.out.println(count);
        System.out.println(maxArea);




    }

    static class Pair {

        int x, y;

        public  Pair(int x,int y) {

            this.x = x;
            this.y = y;

        }
    }
}
