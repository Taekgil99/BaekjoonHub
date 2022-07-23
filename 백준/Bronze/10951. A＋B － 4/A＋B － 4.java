import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String line;
        while ((line = br.readLine()) != null) {
            int a = line.charAt(0) -'0';
            int b = line.charAt(2) -'0';
            sb.append(a+b).append('\n');
        }
        System.out.println(sb);
    }
}