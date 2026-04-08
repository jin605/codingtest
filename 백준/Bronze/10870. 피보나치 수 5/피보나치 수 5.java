import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = app.fibonacci(n);

        System.out.println(result);





    }

    public static class app {

        static int fibonacci (int x) {

            if (x == 0) {

                return 0;
            } else if (x == 1) {

                return 1;
            }

            return fibonacci(x-1) + fibonacci(x-2);

        }

    }



}
