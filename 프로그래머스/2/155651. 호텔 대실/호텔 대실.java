import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        // 1. 시간을 분 단위 정수로 변환하여 리스트에 저장
        int[][] times = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = parseTime(book_time[i][0]);
            times[i][1] = parseTime(book_time[i][1]) + 10; // 시간 10분 추가
        }

        // 2. 시작 시간 기준으로 오름차순 정ㅕㅕㄹ
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        // 3. 우선순위 큐로 종료 시간 관리 (가장 빨리 비는 방이 우선)?
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] book : times) {
            if (pq.isEmpty()) {
                pq.offer(book[1]);
                continue;
            }

            // 가장 빨리 비는 방의 종료 시간 확인
            if (pq.peek() <= book[0]) {
                pq.poll(); // 기존 방을 재사용하므로 기존 종료 시간 제거
            }
            pq.offer(book[1]); // 새 종료 시간(혹은 갱신된 시간) 추가
        }

        return pq.size();
    }

    private int parseTime(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        return hour * 60 + minute;
    }
}
