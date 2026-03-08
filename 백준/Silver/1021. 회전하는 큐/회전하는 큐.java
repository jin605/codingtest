import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> que = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            que.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i<m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int targetIdx = que.indexOf(target);

            int halfIdx = que.size()/2;

            if (targetIdx <= halfIdx) {
                for (int j =0; j < targetIdx; j++) {
                    que.addLast(que.pollFirst());
                    count ++;
                }

            } else {
                for (int j = 0; j < que.size() - targetIdx; j++) {
                    que.addFirst(que.pollLast());
                    count ++;

                }
            }

            que.pollFirst();





        }

        System.out.println(count);













    }
}
