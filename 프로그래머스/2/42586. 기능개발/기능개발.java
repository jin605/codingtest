import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> solList = new ArrayList<>();

        int index = 0;
        while (index < progresses.length) {

            int target = 0;

            for (int i = index; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            if (progresses[index] >= 100) {

                index++;
                target++;

                for (int j = index; j < progresses.length; j++) {
                    if (progresses[j] >= 100) {
                        index++;
                        target++;
                    } else {
                        break;
                    }
                }

                solList.add(target);
            }
        }

        int[] answer = new int[solList.size()];

        int i = 0;
        for (int tar : solList) {
            answer[i++] = tar;
        }

        return answer;

    }
}