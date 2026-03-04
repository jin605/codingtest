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
        // 스택의 capacity 받기

        Deque<Integer> stk = new ArrayDeque<>(); //

        int j = 1; // 배열의 시작점

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (j <= target) {
                stk.offerFirst(j++); // 1먼저 넣고 j++
                sb.append("+").append("\n");
            }

            if (stk.peekFirst() != target) {
                System.out.println("NO");
                return;
            }

            stk.pollFirst();
            sb.append("-").append("\n");




        }

        System.out.println(sb);
    }
}
