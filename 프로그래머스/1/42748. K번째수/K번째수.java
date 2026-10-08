import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            
            int st = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            int[] newArray = Arrays.copyOfRange(array, st-1, end);
            for (int k = 0; k < newArray.length-1; k++) {
                
                    for (int j = 0; j < newArray.length-1; j++) {

                    if (newArray[j] > newArray[j+1]) {

                        int temp = newArray[j];
                        newArray[j] = newArray[j+1];
                        newArray[j+1] = temp;

                    }
                
            }

                
            }
            System.out.println(Arrays.toString(newArray));
            answer[i] = newArray[target-1];

        }
   
        return answer;
    }
}