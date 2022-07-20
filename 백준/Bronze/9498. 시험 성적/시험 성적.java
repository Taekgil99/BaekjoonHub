import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        if (90<=a) {
            System.out.println("A");
        } else if (80<=a) {
            System.out.println("B");
        } else if (70<=a) {
            System.out.println("C");
        } else if (60 <= a) {
            System.out.println("D");
        } else System.out.println("F");

    }
}