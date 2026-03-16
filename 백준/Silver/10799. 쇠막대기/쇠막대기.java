import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Deque<Character> stk = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stk.offerFirst(c);

            } else {
                stk.pollFirst();

                if (s.charAt(i-1)=='(') {
                    count += stk.size();
                } else {
                    count +=1;
                }
            }
        }
        System.out.println(count);
    }
}
