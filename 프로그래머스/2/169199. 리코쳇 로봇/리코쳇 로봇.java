import java.util.*;

class Solution {
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int solution(String[] board) {
        int R = board.length;
        int C = board[0].length();
        
        int[] start = new int[2];
        int[] goal = new int[2];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                char ch = board[i].charAt(j);
                if (ch == 'R') {
                    start = new int[]{i, j};
                } else if (ch == 'G') {
                    goal = new int[]{i, j};
                }
            }
        }

        return bfs(board, start, goal, R, C);
    }

    private int bfs(String[] board, int[] start, int[] goal, int R, int C) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[R][C];

        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cr = curr[0];
            int cc = curr[1];
            int dist = curr[2];

            if (cr == goal[0] && cc == goal[1]) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nr = cr;
                int nc = cc;

                while (true) {
                    int nextR = nr + dr[i];
                    int nextC = nc + dc[i];

                    if (nextR >= 0 && nextR < R && nextC >= 0 && nextC < C && board[nextR].charAt(nextC) != 'D') {
                        nr = nextR;
                        nc = nextC;
                    } else {
                        break;
                    }
                }

                if (!visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return -1;
    }
}