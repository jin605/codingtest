
import java.util.ArrayDeque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        ArrayDeque<Integer> que = new ArrayDeque<>();
        ArrayDeque<Integer> bridge = new ArrayDeque<>();

        for (int truck : truck_weights) {
            que.offerLast(truck);
        }

        for (int i = 0; i < bridge_length; i++) {
            bridge.offerLast(0);
        }

        int briWeight = 0;
        int answer = 0;

        while (!que.isEmpty() || briWeight > 0) {

            int lastTruck = bridge.pollFirst();
            briWeight -= lastTruck;

            if (!que.isEmpty() &&
                briWeight + que.peekFirst() <= weight) {

                int curTruck = que.pollFirst();
                briWeight += curTruck;
                bridge.offerLast(curTruck);

            } else {
                bridge.offerLast(0);
            }

            answer++;
        }

        return answer;
    }
}
