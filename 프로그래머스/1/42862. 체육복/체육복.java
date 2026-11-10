import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;
        boolean[] reserved = new boolean[n + 1];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. 여벌 체육복이 있지만 도난당한 학생 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserved[reserve[j]] = true;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 2. 체육복 대여
        for (int i = 0; i < lost.length; i++) {

            if (lost[i] == -1) {
                continue;
            }

            // 앞번호 학생에게 먼저 빌리기
            for (int j = 0; j < reserve.length; j++) {

                if (!reserved[reserve[j]] &&
                    lost[i] - 1 == reserve[j]) {

                    answer++;
                    reserved[reserve[j]] = true;
                    lost[i] = -1;
                    break;
                }
            }

            if (lost[i] == -1) {
                continue;
            }

            // 앞번호에게 못 빌렸으면 뒷번호 확인
            for (int j = 0; j < reserve.length; j++) {

                if (!reserved[reserve[j]] &&
                    lost[i] + 1 == reserve[j]) {

                    answer++;
                    reserved[reserve[j]] = true;
                    lost[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}