class Solution {
    
    int[] numbers;
    int target;
    int index = 0;
    int sum = 0;
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        this.numbers = numbers;
        this.target = target;

        dfs(index, sum);
        
        return answer;
    }
    
    void dfs (int index, int sum) {
        
        if (index == numbers.length) {
            
            if (sum == target) {
                answer++;
            }   
            
            return;
        }
        
        dfs (index + 1, sum + numbers[index]);
        dfs (index + 1, sum - numbers[index]);
    }   
}


