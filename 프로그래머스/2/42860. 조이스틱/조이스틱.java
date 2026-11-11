class Solution {
    public int solution(String name) {
        int n = name.length();
        int vertical = 0;
        int horizontal = n - 1;

        for (int i = 0; i < n; i++) {
            int up = name.charAt(i) - 'A';
            int down = 'Z' - name.charAt(i) + 1;
            vertical += Math.min(up, down);

            // i 다음에 연속된 A를 건너뛴다.
            int next = i + 1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            int right = i;
            int left = n - next;

            horizontal = Math.min(horizontal, 2 * right + left);
            horizontal = Math.min(horizontal, right + 2 * left);
        }

        return vertical + horizontal;
    }
}