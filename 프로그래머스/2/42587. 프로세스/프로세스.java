import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {

        ArrayDeque<int[]> que = new ArrayDeque<>();

        int index = 0;
        for (int pri : priorities) {
            que.offerLast(new int[]{pri,index++});
        }

        int answer = 0;

        while(!que.isEmpty()) {

            int maxPri = 0;
            for (int[] pri : que) {
                int curPri = pri[0];
                if (curPri > maxPri) {
                    maxPri = curPri;
                }
            }

            int[] target =  que.pollFirst();
            if (target[0] == maxPri) {
                answer++;

                if (target[1] == location) {
                    return answer;
                }
                
            } else {
                que.offerLast(target);
            }


        }

        return answer;


    }
}