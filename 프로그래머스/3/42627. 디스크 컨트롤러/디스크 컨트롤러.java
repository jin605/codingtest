import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(int[][] jobs) {

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );

        int target = 0;  
        int index = 0;   
        int count = 0;   
        int answer = 0;  

        while (count < jobs.length) {

            while (index < jobs.length && jobs[index][0] <= target) {
                pq.offer(jobs[index]);
                index++;
            }

            if (!pq.isEmpty()) {

                int[] job = pq.poll();

                target += job[1];
                answer += target - job[0];
                count++;

            } else {

                target = jobs[index][0];
            }
        }

        return answer / jobs.length;
    }
}