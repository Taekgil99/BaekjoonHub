import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        // (높이 - 미끌어지는 높이) / 올라가는 높이
        int day = (V - B) / (A - B);
        
        // 나머지가 있으면 하루 더 올라가야함
        if ((V - B) % (A - B) != 0) {
            day++;
        }

        System.out.println(day);
    }
}