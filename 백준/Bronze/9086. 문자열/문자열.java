import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    String str = "";

    for (int i = 1; i <= count; i++) {
        str = br.readLine();
        if (str.length() == 1) System.out.printf(str+str+"\n");
        else {
            System.out.println(new StringBuilder()
                    .append(str.charAt(0)).append(str.charAt(str.length() - 1)).toString());
        }
    }
    }
}