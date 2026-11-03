class Solution {
    
    int target;
    int[] numbers;
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0);
        
        return answer;
        
    }
    
    void dfs(int sum, int count) {
        
        if (sum == target && count == numbers.length) {
            answer++;
        }
        
        if (count == numbers.length) {
            return;
        }
        
        dfs(sum + numbers[count], count+1);
        dfs(sum - numbers[count], count+1);
        
    }
}