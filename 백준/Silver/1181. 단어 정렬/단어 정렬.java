import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    String[] arr = new String[N];
    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }
    br.close();
//    //중복제거
//    String[] distinctArr = Arrays.stream(arr).distinct().toArray(String[]::new);
    //정렬
    Arrays.sort(arr, new Comparator<String>() {
      public int compare(String s1, String s2) {
        //문자열의 길이가 같다면 사전순 정렬
        if (s1.length() == s2.length()) {
          return s1.compareTo(s2);
        }
        //다르면 길이순 정렬
        else {
          return s1.length() - s2.length();
        }
      }
    });
    StringBuilder sb = new StringBuilder();

    sb.append(arr[0]).append('\n');
    for (int i = 1; i < N; i++) {
      if (!arr[i].equals(arr[i - 1])) {
        sb.append(arr[i]).append('\n');
      }
    }
    System.out.println(sb);
  }
}