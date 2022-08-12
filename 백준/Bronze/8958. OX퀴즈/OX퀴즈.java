import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        final int T = Integer.parseInt(reader.readLine());

        ArrayList<Integer> result = new ArrayList<>();
        String[] OX = new String[T];

        int count = 0;
        int sum = 0;

        for (int i = 0; i < T; i++) {
            OX[i] = reader.readLine();
        }

        for (int i = 0; i < OX.length; i++) {

            String str = OX[i];

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                else if (str.charAt(j) == 'X') {
                    count = 0;
                }
            }
            result.add(i, sum);
            sum = 0;
            count = 0;
        }
        Iterator<Integer> it = result.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "\n");
        }
    }
}