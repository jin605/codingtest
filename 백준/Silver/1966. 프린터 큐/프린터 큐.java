import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Doc> que = new ArrayDeque<>();

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int count = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());

                que.offerLast(new Doc(j, priority));


            }

            while (!que.isEmpty()) {

                Doc current = que.pollFirst();
                boolean hasHigh = false;

                for (Doc d : que) {
                    if (d.priority > current.priority) {
                        hasHigh = true;
                        break;
                    }
                }

                if (hasHigh) {
                    que.offerLast(current);
                } else {
                    count++;
                    if (current.id == m) {
                        System.out.println(count);
                        break;
                    }


                }


            }
        }


    }

    static class Doc {
        int id;
        int priority;

        public Doc(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }

    }

}
