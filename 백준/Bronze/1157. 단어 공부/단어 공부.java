import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
                arr[str.charAt(i) - 'a']++;
            } else {
                arr[str.charAt(i) - 'A']++;

            }
        }

        int max = 0;
        char result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i+'A');
            } else if (arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}