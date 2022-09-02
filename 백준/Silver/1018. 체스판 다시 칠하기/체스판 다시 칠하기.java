import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static int min = 62;
  public static boolean[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    //보드 틀
    arr = new boolean[N][M];
    //보드 구현
    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      for (int j = 0; j < M; j++) {
        if (str.charAt(j) == 'W') {
          arr[i][j] = true;
        } else {
          arr[i][j] = false;
        }
      }
    }
    int csN = N - 7;
    int csM = M - 7;

    // i,j = 88 사각형 시작점
    for (int i = 0; i < csN; i++) {
      for (int j = 0; j < csM; j++) {
        find(i, j);
      }
    }

    System.out.println(min);
  }

  public static void find(int x, int y) {
    int maxX = x + 8;
    int maxY = y + 8;
    int count = 0;

    boolean TF = arr[x][y];

    for (int i = x; i < maxX; i++) {
      for (int j = y; j < maxY; j++) {
        if (arr[i][j] != TF) {
          count++;
        }
        // 칸 바뀔 때마다 색도 바꿔줌.
        TF = !TF;
      }
      TF = !TF;
    }
    count = Math.min(count, 64 - count);
    min = Math.min(min, count);
  }

  /**
   * M * N 크기의 보드
   * 검은색 B or 흰색 W
   * 잘라서 8*8 로 만들었을 때 색을 다시 칠해서
   * 체크판형태로 만든다. 이때 최소 색칠하는 수
   * --------------------------------
   * 브포문제.
   * 보드는 boolean 2차 배열.
   * 88 보드 이동하면서 규칙에 맞지않는 칸 수
   * = 다시 색칠해야하는 칸 수.
   * (8*8) - 다시색칠칸수 = 첫칸색 반대일 때
   * 경우의수.
   * 비교해서 최소 값 찾아서 반환.
   * --------------------------------
   * 경우의 수
   * - 첫 칸이 흑, 백 : 2
   * - NM이 88 이상일 때 : (N-7) * (M-7)
   * - 88일 때 : 1
   * --------------------------------
   *
   */
}