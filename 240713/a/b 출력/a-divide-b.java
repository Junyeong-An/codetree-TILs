import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        BigDecimal result = new BigDecimal((double) a / b);
        result = result.setScale(21, RoundingMode.FLOOR);
        
        System.out.println(result.toPlainString());
        
        sc.close();
    }
}