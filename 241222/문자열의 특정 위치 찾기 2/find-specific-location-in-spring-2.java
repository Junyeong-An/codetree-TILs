import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "grape", "blueberry", "orange"};

        Scanner scanner = new Scanner(System.in);
        char targetChar = scanner.next().charAt(0);
        scanner.close();

        List<String> matchingStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() >= 4) {
                if (str.charAt(2) == targetChar || str.charAt(3) == targetChar) {
                    matchingStrings.add(str);
                }
            } else if (str.length() >= 3) {
                if (str.charAt(2) == targetChar) {
                    matchingStrings.add(str);
                }
            }
        }

        for (String matchingStr : matchingStrings) {
            System.out.println(matchingStr);
        }

        System.out.println(matchingStrings.size());
    }
}
