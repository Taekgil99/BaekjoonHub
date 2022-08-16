import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String firNum = st.nextToken();
        String secNum = st.nextToken();

        StringBuffer num1 = new StringBuffer(firNum);
        StringBuffer num2 = new StringBuffer(secNum);
        int revFir = Integer.parseInt(num1.reverse().toString());
        int revSec = Integer.parseInt(num2.reverse().toString());

        if (revFir > revSec) {
            System.out.println(revFir);
        } else  {
            System.out.println(revSec);
        }
    }
}