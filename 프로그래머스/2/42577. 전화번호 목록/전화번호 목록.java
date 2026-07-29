import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set <String> phoneSet = new HashSet<>();
        
        for (String phone : phone_book) {
            
            phoneSet.add(phone);
            
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            
            for (int j = 0; j < phone_book[i].length(); j++) {
                
                String prefix = phone_book[i].substring(0,j);
                
                if (phoneSet.contains(prefix)) {
                    return false;
                }
                
            }
        }
        
        return true;
    }
}