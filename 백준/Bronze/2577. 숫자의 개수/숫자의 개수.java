import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String product = String.valueOf(A * B * C);

        for (int i = 0; i < product.length(); i++) {
            numbers[product.charAt(i) - 48]++;
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}