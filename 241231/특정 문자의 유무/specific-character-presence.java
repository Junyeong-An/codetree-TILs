import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        boolean containsEe = input.contains("ee");
        boolean containsAb = input.contains("ab");
        
        System.out.println((containsEe ? "Yes" : "No") + " " + (containsAb ? "Yes" : "No"));
    }
}
