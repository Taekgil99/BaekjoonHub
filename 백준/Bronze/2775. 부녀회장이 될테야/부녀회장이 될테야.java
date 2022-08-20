import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 아파트 [층(k), 사람(n)] 2차원배열 생성
        // 1<= k,n <= 14
        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            //0층 i호 인원은 i
            apt[0][i] = i;
            //i층 1호는 1
            apt[i][1] = 1;
        }
        //1층부터
        for (int i = 1; i < 15; i++) {
            //2호부터
            for (int j = 2; j < 15; j++) {
                //조건 : i층의 j인원은 i-1층의 j호까지 인원합
                //i-1층의 j호 인원 + 1~j-1호(= i층의 이전호수 인원)
                // -> i층 j호
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }
        //아파트 배열 완성

        //테스트 케이스
        int T = Integer.parseInt(br.readLine());

        //apt[k][n] 값 구하기
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apt[k][n]).append('\n');
        }
        //결과출력
        System.out.println(sb);
    }
}