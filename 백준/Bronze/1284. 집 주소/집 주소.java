import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String n = sc.next();
            
            // "0"이 입력되면 반복문 종료
            if (n.equals("0")) {
                break;
            }

            int totalWidth = 0;

            // 1. 양 끝 여백 1cm씩 총 2cm 기본 시작
            totalWidth += 2;

            // 2. 숫자 사이의 여백 (숫자 개수 - 1)만큼 1cm씩 추가
            totalWidth += (n.length() - 1);

            // 3. 각 숫자의 너비 계산
            for (int i = 0; i < n.length(); i++) {
                char num = n.charAt(i);
                if (num == '1') {
                    totalWidth += 2;
                } else if (num == '0') {
                    totalWidth += 4;
                } else {
                    totalWidth += 3;
                }
            }

            // 결과 출력
            System.out.println(totalWidth);
        }
        
        sc.close();
    }
}