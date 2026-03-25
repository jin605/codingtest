import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 합(s)과 차(d) 입력 받기
        if (sc.hasNextInt()) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            // 1. 합보다 차가 크면 점수가 음수가 나오므로 불가능
            // 2. (s + d)가 홀수이면 2로 나누어 떨어지지 않아 정수 점수가 안 나옴
            if (s < d || (s + d) % 2 != 0) {
                System.out.println("-1");
            } else {
                // 큰 점수(x)와 작은 점수(y) 계산
                int x = (s + d) / 2;
                int y = (s - d) / 2;

                // 결과 출력 (큰 점수부터)
                System.out.println(x + " " + y);
            }
        }
        sc.close();
    }
}