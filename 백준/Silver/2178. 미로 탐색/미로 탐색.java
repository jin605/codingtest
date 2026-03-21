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

        String[] board = new String[n];
        int[][] dist = new int[n][m];
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};

        for (int i = 0; i < n; i++) {

            board[i] = br.readLine();
            for (int j = 0; j <m;j++) {
                dist[i][j] = -1;
            }
        }

        Deque<Pair> que = new LinkedList<>();
        que.offerLast(new Pair(0,0));
        dist[0][0] = 0;

        while (!que.isEmpty()) {

            Pair cur = que.pollFirst();

            for (int dir =0; dir < 4; dir ++) {

                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >=m) continue;

                if (dist[nx][ny] >= 0 || board[nx].charAt(ny) == '0') continue;

                dist[nx][ny] = dist[cur.x][cur.y] + 1;
                que.offerLast(new Pair(nx,ny));

            }

        }

        System.out.println(dist[n-1][m-1] +1);

    }

    static class Pair {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
