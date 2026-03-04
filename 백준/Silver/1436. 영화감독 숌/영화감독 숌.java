import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int num = 666;

        int n = Integer.parseInt(br.readLine());

        while (count != n) {
            String strNum = String.valueOf(num);
            if (strNum.contains("666")){
                count++;
            }
            num++;


        }

        System.out.println(num-1);


    }

}
