import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 입력 받기
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // 0-based 인덱스로 계산하기 위해 1을 빼줌
        n1--;
        n2--;

        // X 좌표 (열 위치): 4로 나눈 몫
        int x1 = n1 / 4;
        int x2 = n2 / 4;

        // Y 좌표 (행 위치): 4로 나눈 나머지
        int y1 = n1 % 4;
        int y2 = n2 % 4;

        // 각 좌표 차이의 절댓값을 더해 직교 거리 계산
        int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        System.out.println(distance);
        
        sc.close();
    }
}