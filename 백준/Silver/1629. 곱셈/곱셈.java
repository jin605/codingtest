import java.util.Scanner;

public class Main {

    static long pow(long a, long b, long m) {

        if (b == 1) return a % m;

        long val = pow(a, b / 2, m);
        val = (val * val) % m;

        if (b % 2 == 0) return val;
        return (val * a) % m;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(pow(a, b, c));
    }
}