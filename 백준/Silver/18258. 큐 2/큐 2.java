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

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> que = new ArrayDeque<>(n);
        int capacity = n;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    que.offerLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(que.isEmpty() ? -1 : que.pollFirst()).append("\n");
                    break;

                case "front" :
                    sb.append(que.isEmpty() ? -1 : que.peekFirst()).append("\n");
                    break;

                case "back" :
                    sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
                    break;


                case "empty" :
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;


                case "size" :
                    sb.append(que.size()).append("\n");
                    break;


            }
        }
        System.out.println(sb);


    }

}
