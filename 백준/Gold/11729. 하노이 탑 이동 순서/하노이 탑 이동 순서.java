import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 하노이 탑 이동 함수 호출 (원반 개수, 출발지, 경유지, 목적지)
        hanoi(N, 1, 2, 3);

        // 결과 출력: 첫 줄에 총 이동 횟수, 이후 이동 경로
        System.out.println(count);
        System.out.print(sb);
    }

    public static void hanoi(int n, int start, int mid, int to) {
        count++; // 이동 횟수 증가

        // 원반이 1개일 때는 그냥 바로 목적지로 옮기면 끝 (Base Case)
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // 1. N-1개를 출발지에서 경유지로 옮김 
        hanoi(n - 1, start, to, mid);

        // 2. 가장 큰 원반을 출발지에서 목적지로 옮김
        sb.append(start + " " + to + "\n");

        // 3. 경유지에 있던 N-1개를 목적지로 옮김 
        hanoi(n - 1, mid, start, to);
    }
}