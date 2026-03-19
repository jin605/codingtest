import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m 입력 받기
        if (!st.hasMoreTokens()) return;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        // 보드 데이터 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0 || vis[i][j]) continue;

                count++;
                Queue<Pair> Q = new LinkedList<>();
                vis[i][j] = true;
                Q.add(new Pair(i, j));

                int curArea = 0;
                while (!Q.isEmpty()) {
                    curArea++;
                    Pair cur = Q.poll();

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur.x + dx[dir];
                        int ny = cur.y + dy[dir];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if (vis[nx][ny] || board[nx][ny] != 1) continue;

                        vis[nx][ny] = true;
                        Q.add(new Pair(nx, ny));
                    }
                }
                if (curArea > maxArea) maxArea = curArea;
            }
        }

        System.out.println(count);
        System.out.println(maxArea);
    }
}