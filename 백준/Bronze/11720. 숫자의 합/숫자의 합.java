import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //for each에 getBytes()사용하면 N 필요없음.
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(byte e : br.readLine().getBytes()) {
            sum += e - '0';
        }
        System.out.println(sum);
    }
}