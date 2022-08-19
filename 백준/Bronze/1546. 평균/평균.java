import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int max = -1;
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            int j = Integer.parseInt(st.nextToken());
            
            if (j > max) {
                max = j;
                
            }
            sum += j;
            
        }
        System.out.println(((sum/max) * 100) / N);
    }
}
