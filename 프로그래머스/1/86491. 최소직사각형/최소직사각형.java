class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for (int i = 0; i< sizes.length; i++) {
            
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int maxA = sizes[0][0];
        int maxB = sizes[0][1];
        
        for (int j = 0; j < sizes.length; j++) {
            
            if (maxA < sizes[j][0]) {
                maxA = sizes[j][0];
            }
            
            if (maxB < sizes[j][1]) {
                maxB = sizes[j][1];
            }
        }
        
        return maxA*maxB;
    }
}

