import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int result = x;

        for (int i = 0; i < 4; i++) {
            if (result > y) {
                result = y;
            } else if (result > w - x) {
                result = w - x;
            } else if (result > h - y) {
                result = h - y;
            }
        }

        System.out.println(result);
        /*
        경계선에 갈 수 있는 경우의 수
        1. x = 0 까지의 거리
            result1 = x
        2. y = 0 까지의 거리
            result2 = y
        3. x = w 까지의 거리
            result3 = w-x
        4. y = h 까지의 거리
            result4 = h-y
         */
    }
}