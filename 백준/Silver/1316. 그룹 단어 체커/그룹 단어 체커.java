
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0 ;i < t; i++) {

            boolean[] alphabet = new boolean[255];
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++){

                char c = s.charAt(j);

                if (!alphabet[c]) {

                    alphabet[c] = true;
                    continue;

                } else {

                    if (c == s.charAt(j-1)) {

                        continue;

                    } else {

                        count++;
                        break;
                    }

                }
            }


        }
        System.out.println(t-count);

    }
}
