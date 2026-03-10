import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s.equals(".")) {
                break;
            }

            System.out.println(solve(s));
        }

    }

    public static String solve (String s) {
        Deque<Character> stk = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                stk.offerFirst(c);
            } else if (c== ')') {
                if (stk.isEmpty() || stk.peekFirst() != '(') {
                    return "no";
                } else {
                    stk.pollFirst();
                }

            } else if (c == ']') {
                if (stk.isEmpty() || stk.peekFirst() != '[') {
                    return "no";
                } else {
                    stk.pollFirst();
                }
            }
        }

        if (stk.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }

    }
}