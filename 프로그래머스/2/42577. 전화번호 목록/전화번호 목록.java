import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {

                String prefix = phone_book[i].substring(0,j);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        
        
        return answer;
    }
}