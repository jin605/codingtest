import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int[] arr = new int[n.length()];

        for (int i = 0; i < n.length(); i++){
            arr[i] = n.charAt(i)-'0';
        }

        for (int i = 0; i < arr.length-1; i++){
            for (int j = arr.length-1; j > i; j--){
                if (arr[j-1] < arr[j]) {
                    int t = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for (int i : arr){
            System.out.print(i);
        }
    }
}
