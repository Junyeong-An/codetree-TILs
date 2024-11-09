import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            int stars = i < n ? 2 * i + 1 : 2 * (size - i - 1) + 1;
            int spaces = (size - stars) / 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}