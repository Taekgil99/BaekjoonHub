import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                stack.push(Integer.parseInt(str.split(" ")[1]));
            } else if (str.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop())
                        .append('\n');
            } else if (str.equals("size")) {
                sb.append(stack.size())
                        .append('\n');
            } else if (str.equals("empty")) {
                sb.append(stack.empty() ? 1 : 0)
                        .append('\n');
            } else if (str.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek())
                        .append('\n');
            }
        }
        System.out.println(sb);
    }
}