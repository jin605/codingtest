import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        boolean[][] visited = new boolean[101][101];
        int count = 0;

        for (int i = 0 ; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10;k++) {

                    if (visited[j][k]) {
                        continue;
                    } else {
                        visited[j][k] = true;
                        count++;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
