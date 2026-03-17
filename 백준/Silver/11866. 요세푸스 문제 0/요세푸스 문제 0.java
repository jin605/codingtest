import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> que = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            que.offer(i+1);
        }
        sb.append("<");

        while (!que.isEmpty()) {

            for (int i = 0 ; i < k-1; i++) {
                que.offerLast(que.pollFirst());
            }

            int result = que.pollFirst();

            if (que.isEmpty()) {
                sb.append(result);
            } else {
                sb.append(result).append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);



    }
}
