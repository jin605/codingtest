import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c') {

                if ( i+1 < s.length()) {
                    if (s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                        i++;
                    }
                }
            }

            else if (c == 'd') {

                if ( i +1 < s.length() ) {
                    if (s.charAt(i+1) == '-') {
                        i++;
                    } else if (s.charAt(i+1) == 'z') {
                        if (i+2 < s.length()) {
                            if (s.charAt(i+2) == '=') {
                                i++;
                                i++;
                            }
                        }
                    }
                }

            } else if (c == 'l') {

                if (i+1 < s.length()) {
                    if (s.charAt(i+1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 'n') {

                if (i+1 < s.length()) {
                    if (s.charAt(i+1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 's') {

                if (i+1 < s.length()) {
                    if (s.charAt(i+1) == '=') {
                        i++;
                    }
                }
            } else if (c == 'z') {

                if (i+1 < s.length()) {
                    if (s.charAt(i+1) == '=') {
                        i++;
                    }
                }
            }

            count++;
        }

        System.out.println(count);

    }

}
