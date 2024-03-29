import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int addNum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            if ( addNum == 0) {
                    break;
            } else {
                sb.append(addNum).append('\n');
            }
        }
        System.out.println(sb);
    }
}