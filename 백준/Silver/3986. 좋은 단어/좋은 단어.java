import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < t; i++) {

            String s = br.readLine();
            Deque<Character> stk = new ArrayDeque<>();

            for (int j = 0; j < s.length(); j++) {
                char wrd = s.charAt(j);

                if (stk.isEmpty() || wrd != stk.peekFirst()) {
                    stk.offerFirst(wrd);
                }
                else if (wrd == stk.peekFirst()) {
                    stk.pollFirst();
                } else {
                    break;
                }
            }

            if (stk.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
