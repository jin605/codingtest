import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] edge) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 양방향 그래프 생성
        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        dist[1] = 0;

        // BFS
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {

                if (dist[next] == -1) {
                    dist[next] = dist[current] + 1;
                    queue.offer(next);
                }
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dist[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (dist[i] == max) {
                answer++;
            }
        }

        return answer;
    }
}