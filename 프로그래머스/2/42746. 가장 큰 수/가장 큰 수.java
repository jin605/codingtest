import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        
        String[] nums = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(nums,
                   (a,b) -> (b+a).compareTo(a+b));
        
        if (nums[0].equals("0")) {
            return "0";
        }
        
        String answer = "";
        
        for (int i = 0; i < nums.length; i++) {
            
            answer += nums[i];
        }
        
        return answer;
    }
}

