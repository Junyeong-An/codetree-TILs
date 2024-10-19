import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int len = A.length();

        for (int n = 1; n <= len; n++) {
            A = rotateRight(A);
            if (A.equals(B)) {
                System.out.println(n);
                return;
            }
        }
        
        System.out.println(-1);
    }

    public static String rotateRight(String s) {
        int len = s.length();
        return s.charAt(len - 1) + s.substring(0, len - 1);
    }
   
}