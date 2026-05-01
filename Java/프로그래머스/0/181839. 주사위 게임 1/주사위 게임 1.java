class Solution {
    // 두 주사위의 값을 받아 규칙에 따라 점수를 계산하는 메소드
    public int solution(int a, int b) {
        // 최종 점수를 저장할 변수
        int result = 0;
        
        // 각 주사위 값이 홀수인지 확인
        boolean isOddA = a % 2 != 0;    // a가 홀수면 true
        boolean isOddB = b % 2 != 0;    // b가 홀수면 true
        
        // 조건에 따라 점수 계산
        if (isOddA && isOddB) {
            // 둘 다 홀수인 경우: a² + b²
            result = (a*a) + (b*b);
        } else if (isOddA || isOddB) {
            // 하나만 홀수인 경우: 2 × (a + b)
            result = 2*(a + b);
        } else {
            // 둘 다 홀수가 아닌 경우: |a - b|
            result = Math.abs(a - b);
        }
        
        // 계산된 점수 반환
        return result;
    }
}