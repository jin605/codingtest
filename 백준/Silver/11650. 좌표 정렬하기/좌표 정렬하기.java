import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][2];

        for (int i = 0 ; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (arr0, arr1) ->
                {
                    if (arr0[0] == arr1[0]){
                        return Integer.compare(arr0[1], arr1[1]);
                    }

                    return Integer.compare(arr0[0],arr1[0]);
                });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}
