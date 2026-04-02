import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < t; i++) {

            int x = Integer.parseInt(br.readLine());

            if (x > 0) {

                minHeap.offer(x);

            } else {
                
                if (minHeap.isEmpty()) {
                    
                    sb.append(0).append("\n");
                } else {

                    sb.append(minHeap.poll()).append("\n");
                }
            }
        }

        System.out.println(sb);

    }
}
