import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        char targetChar = reader.readLine().charAt(0);
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        System.out.println(count);
    }
}