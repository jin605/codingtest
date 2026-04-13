import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 T를 입력받습니다.
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            // 두 주사위의 눈을 입력받습니다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // "Case x: 합" 형식으로 출력합니다.
            System.out.println("Case " + i + ": " + (a + b));
        }
        
        sc.close();
    }
}