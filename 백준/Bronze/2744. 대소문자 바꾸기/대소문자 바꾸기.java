import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = "";

        for(char x : input.toCharArray()) {

            if (Character.isLowerCase(x)) {
                result += Character.toUpperCase(x);
            } else {
                result += Character.toLowerCase(x);
            }
        }
        System.out.println(result);
    }
}