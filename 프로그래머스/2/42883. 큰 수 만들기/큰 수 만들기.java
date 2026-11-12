class Solution {
    public String solution(String number, int k) {
        StringBuilder picked = new StringBuilder();
        int remaining = k;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);

            while (remaining > 0
                    && picked.length() > 0
                    && picked.charAt(picked.length() - 1) < digit) {
                picked.setLength(picked.length() - 1);
                remaining--;
            }

            picked.append(digit);
        }

        picked.setLength(picked.length() - remaining);
        
        return picked.toString();
        
        
    }
}