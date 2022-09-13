import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 에라토테네스의 체 소수
        boolean[] prime = new boolean[1001];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i]) continue;
            for (int j = i * 2; j <= 1000; j += i) {
                prime[j] = true;
            }
        }

        for (int i=0; i < arr.length; i++) {
            if (!prime[arr[i]]) {
                count++;
            }
        }

        System.out.println(count);
    }
}