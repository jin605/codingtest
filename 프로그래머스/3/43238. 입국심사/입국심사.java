class Solution {
    public long solution(int n, int[] times) {
        
        long maxTimes = 0;
        
        for (int time : times) {
            if (maxTimes < time) {
                maxTimes = time;
            }
        }
        
        long left = 0;
        long right = (long) maxTimes * n;
        
        while(left <= right) {
            
            long mid = left + (right-left)/2;
            long count = 0;
            
            for (int i = 0; i < times.length; i++) {
                count += mid/times[i];
            }
            
            if (count < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}