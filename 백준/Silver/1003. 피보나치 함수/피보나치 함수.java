import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 0과 1의 호출 횟수를 저장할 DP 배열 (최대 n은 40)
        int[][] dp = new int[41][2];

        // 초기값 설정
        dp[0][0] = 1; dp[0][1] = 0; // n=0일 때 (0호출:1, 1호출:0)
        dp[1][0] = 0; dp[1][1] = 1; // n=1일 때 (0호출:0, 1호출:1)

        // DP 테이블 채우기
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }
        System.out.print(sb);
    }
}