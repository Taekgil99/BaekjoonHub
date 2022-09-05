import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int start = 0;

        while (n-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    s.push(i);
//                    bw.write("+\n");
                    sb.append('+').append('\n');
                }
                start = value;
            } else if (value != s.peek()) {
                System.out.println("NO");
                return;
            }
            s.pop();
//            bw.write("-\n");
            sb.append('-').append('\n');
        }
        br.close();
//        bw.flush();
//        bw.close();
        System.out.println(sb);
    }
}