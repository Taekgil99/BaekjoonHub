import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 에라토스테네스의 체 초기화: n개 요소에 true 설정(소수로 간주)
        boolean[] prime = new boolean[N + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= N; i++) {
            if (prime[i]) continue;
            for (int j = i * 2; j <= N; j += i) {
                prime[j] = true;
            }
        }

        // M이상 N이하의 소수 출력
        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}