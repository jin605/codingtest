import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        HashMap<Integer, Integer> cowMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cow = Integer.parseInt(st.nextToken());
            int street = Integer.parseInt(st.nextToken());

            if (!cowMap.containsKey(cow)) {

                cowMap.put(cow, street);
            } else {

                if (cowMap.get(cow) != street) {
                    count++;
                }

                cowMap.put(cow,street);

            }
            
         






        }

        System.out.println(count);


    }
}
