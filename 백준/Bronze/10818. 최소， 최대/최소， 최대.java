import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = -1000000;
        int min = 1000000;
        
        int N = Integer.parseInt(br.readLine());
        
        String[] lines = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < lines.length; i++) {
            lines[i] = st.nextToken();
        }
        
        for (String line : lines) {
            int a = Integer.parseInt(line);
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }
        System.out.printf("%d %d", min, max);
    }
}