import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        while (true) {
            String str = br.readLine();
            sb = new StringBuilder(str);
            String reversed = sb.reverse().toString();
            if (str.equals("0")) {
                break;
            }
            if (str.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}