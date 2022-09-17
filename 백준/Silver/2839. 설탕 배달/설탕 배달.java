import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 3kg 봉지와 5kg 봉지가 있다.
         * 더 적은 수의 봉지를 사용하여 Nkg의 설탕을 배달하려고 한다.
         * 3kg 봉지와 5kg 봉지를 사용하여 Nkg의 설탕을 배달할 수 없다면 -1을 출력한다.
         * 3kg 봉지와 5kg 봉지를 사용하여 Nkg의 설탕을 배달할 수 있다면 봉지의 최소 개수를 출력한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while (N >= 0) {
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                return;
            }
            N -= 3;
            count++;
        }
        System.out.println(-1);
    }
}