import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        boolean[] arr = new boolean[101];

        int count = 0;
        for (int i = 0; i < t; i++) {

            int num = sc.nextInt();

            if (arr[num]) {
                count++;
            } else {
                arr[num] = true;
                
            }


        }
        System.out.println(count);




    }
}
