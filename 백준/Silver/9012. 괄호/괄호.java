import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            vps(str);
        }

        System.out.println(sb);
    }

    public static void vps(String str) {
        if (str.length() % 2 != 0) {
            sb.append("NO").append('\n');
        }
        else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    count++;
                }
                else {
                    count--;
                }
                if (count < 0) {
                    sb.append("NO").append('\n');
                    return;
                }
            }
            if (count == 0) {
                sb.append("YES").append('\n');
            }
            else {
                sb.append("NO").append('\n');
            }
        }
    }
}