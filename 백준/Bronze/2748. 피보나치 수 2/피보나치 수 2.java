import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        memo = new long[n+1];
        System.out.println(fibo(n));


    }

    static long fibo (int n){

        if (n <= 2) {
            return 1;
        }

        if (memo[n] != 0){
            return memo[n];
        }

        memo[n] = fibo(n - 1) + fibo(n - 2);

        return memo[n];


    }

}
