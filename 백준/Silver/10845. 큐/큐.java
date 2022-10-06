import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> qu = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                qu.offer(Integer.valueOf(str.split(" ")[1]));
            } else if (str.equals("pop")) {
                sb.append(qu.isEmpty() ? -1 : qu.poll()).append('\n');
            } else if (str.equals("size")) {
                sb.append(qu.size()).append('\n');
            } else if (str.equals("empty")) {
                sb.append(qu.isEmpty() ? 1 : 0).append('\n');
            } else if (str.equals("front")) {
                sb.append(qu.isEmpty() ? -1 : qu.peek()).append('\n');
            } else if (str.equals("back")) {
                sb.append(qu.isEmpty() ? -1 : qu.getLast()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
