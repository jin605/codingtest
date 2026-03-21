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
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i =0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {


                case 1 :
                    int input = Integer.parseInt(st.nextToken());
                    stk.offerFirst(input);
                    break;

                case 2:
                    sb.append(stk.isEmpty() ? "-1" :  stk.pollFirst()).append("\n");
                    break;

                case 3:
                    sb.append(stk.size()).append("\n");
                    break;

                case 4:
                    sb.append(stk.isEmpty() ? "1" : "0").append("\n");
                    break;

                case 5:
                    sb.append(stk.isEmpty() ? "-1" : stk.peekFirst()).append("\n");
                    break;

            }


        }

        System.out.println(sb);
        




    }
}
