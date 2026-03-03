import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> que = new ArrayDeque<>(n);

        for (int i =0; i < n;i++){
            que.add(i+1);
        }

        while (que.size() >= 2){
            que.pollFirst();
            Integer x = que.peekFirst();
            que.pollFirst();
            que.offerLast(x);
        }

        System.out.println(que.peekFirst());



    }
}
