import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] prices) {
        
        ArrayDeque<Integer> que = new ArrayDeque<>();
        int[] answer = new int[prices.length];

        for (int price : prices){
            que.offerLast(price);
        }

        for(int i = 0; i < prices.length-1; i++) {

            int cnt = 0;
            int idx = que.pollFirst();

            for (int j = i+1; j < prices.length; j++) {
                int num = prices[j];
                cnt++;
                if (idx > num) {
                    break;
                }
            }
            answer[i] = cnt;
        }

        answer[prices.length-1] = 0;

        return answer;

    }
}