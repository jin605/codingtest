
import java.util.ArrayDeque;

class Solution {

    public int solution(String begin, String target, String[] words) {

        boolean[] visited = new boolean[words.length];
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<Integer> depth = new ArrayDeque<>();

        queue.offer(begin);
        depth.offer(0);

        while (!queue.isEmpty()) {

            String cur = queue.poll();
            int count = depth.poll();

            if (cur.equals(target)) {
                return count;
            }

            for (int i = 0; i < words.length; i++) {

                if (visited[i]) continue;

                int diff = 0;

                for (int j = 0; j < cur.length(); j++) {
                    if (cur.charAt(j) != words[i].charAt(j)) {
                        diff++;
                    }
                }

                if (diff == 1) {
                    visited[i] = true;
                    queue.offer(words[i]);
                    depth.offer(count + 1);
                }
            }
        }

        return 0;
    }
}
