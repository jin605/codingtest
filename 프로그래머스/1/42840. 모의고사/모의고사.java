class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) {
                firstCnt++;
            } 
            if (answers[i] == second[i%8]) {
                secondCnt++;
            } 
            if (answers[i] == third[i%10]) {
                thirdCnt++;
            }
        }
        
        int max = firstCnt;
        int count = 0;
        if (secondCnt > max) {
            max = secondCnt;
        } 
        if (thirdCnt > max) {
            max = thirdCnt;
        }
        
        if (max == firstCnt) count++;
        if (max == secondCnt) count++;
        if (max == thirdCnt) count++;
        
        int[] answer = new int[count];
        
        int idx = 0;
        
        if (firstCnt == max) answer[idx++] = 1;
        if (secondCnt == max) answer[idx++] = 2;
        if (thirdCnt == max) answer[idx++] = 3;
        
        
        return answer;
    }
}