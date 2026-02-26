import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] que = new int [t];
        int front = 0;
        int num = 0;
        int rear = 0;


        for (int i =0; i < t; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd){
                case "push" :
                    int intCmd = Integer.parseInt(st.nextToken());
                    que[rear++] = intCmd;
                    num++;
                    if (rear == t){
                        rear =0;
                    }
                    break;

                case "pop" :
                    if (num <= 0) {
                        System.out.println( -1);
                    } else {
                        
                        int x = que[front++];
                        num--;
                        if (front == t){
                            front = 0;
                        }
                        System.out.println(x);
                    }

                    break;


                case "size" :
                    System.out.println(num);
                    break;


                case "empty" :
                    if (num <= 0){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front" :
                    if (num <= 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(que[front]);
                    }
                    break;


                case "back" :
                    if (num <= 0){
                        System.out.println(-1);
                    } else {
                        System.out.println(que[rear-1]);
                    }
                    break;

            }




        }





    }
}
