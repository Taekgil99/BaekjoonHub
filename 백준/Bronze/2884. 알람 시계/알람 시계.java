import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int alM = M - 45;
        int alH = H;

        if (!(alM >= 0)) {
            alM += 60;
            alH--;
            if (!(alH >= 0)) {
                alH += 24;
            }
        } else if (!(alM <= 59)) {
            alM -= 45;
            alH++;
            if (!(alH <= 23)) {
                alH -= 24;
            }
        }
        System.out.printf("%d %d", alH, alM);
    }
}