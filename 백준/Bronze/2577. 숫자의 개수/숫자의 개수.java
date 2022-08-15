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
            char c = product.charAt(i);

            switch (c) {
                case '1':
                    numbers[1]++;
                    break;
                case '2':
                    numbers[2]++;
                    break;
                case '3':
                    numbers[3]++;
                    break;
                case '4':
                    numbers[4]++;
                    break;
                case '5':
                    numbers[5]++;
                    break;
                case '6':
                    numbers[6]++;
                    break;
                case '7':
                    numbers[7]++;
                    break;
                case '8':
                    numbers[8]++;
                    break;
                case '9':
                    numbers[9]++;
                    break;
                default :
                    numbers[0]++;
                    break;
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}