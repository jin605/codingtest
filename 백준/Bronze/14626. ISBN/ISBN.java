import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;
        int j = 0;

        for (int i = 0 ; i < s.length(); i++){

            char c = s.charAt(i);

            if (c == '*') {
                j = i;
                continue;
            }

            int num = c - '0';

            if (i % 2 == 0) {
                sum += num;

            } else {
                sum += 3 * num;
            }

        }

        for (int i =0 ; i < 10; i++) {
            int total = sum;

            if (j % 2 == 0) {

                total += i;

            } else {
                total += 3 * i;
            }
            
            if (total % 10 == 0) {
                System.out.println(i);
                break;
            }

        }
        
        



    }
}
