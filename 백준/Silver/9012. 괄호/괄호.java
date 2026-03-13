import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n; i++) {

            String ps = br.readLine();

            Deque<Character> stk = new ArrayDeque<>();

            for (int j = 0; j < ps.length(); j++) {

                char c = ps.charAt(j);

                if (c == '(') {

                    stk.offerFirst(c);

                }
                else if (c == ')') {

                    if (stk.isEmpty() || stk.peekFirst() == ')') {
                        stk.offerFirst(c);
                        break;
                    }
                    stk.pollFirst();
                }

            }
            if (stk.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

        }

        System.out.println(sb);



    }
}
