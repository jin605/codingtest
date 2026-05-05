import java.util.*;

class Solution {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {

            int cur = prices[i];
            int decreaseDay = 0;

            for (int j = i + 1; j < prices.length; j++) {
                decreaseDay++;
                
                if (i == prices.length-1) {
                    answer[j] = 0;
                    break;
                }

                int diff = prices[j];
                if (cur > diff) {
                    break;
                } 
            }
            answer[i] = decreaseDay;

        }

        return answer;


    }
}