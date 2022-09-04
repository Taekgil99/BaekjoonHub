import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    /**
     * N번 째영화 = 정수중 N번 째로 666이 포함 되는 수
     * 1부터 1씩 증가시키면서 666이 포함될 때마다 카운트 1 증가
     * N = 카운트 일때 정수 출력
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int answer = 666;

    int count = 1;

    while (count != N) {
      answer++;
      String str = String.valueOf(answer);
      if (str.contains("666")) {
        count++;
      }
    }
    System.out.println(answer);
  }
}