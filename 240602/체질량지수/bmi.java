import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int kg = sc.nextInt();
        double b = ((10000*kg) / (cm*cm));
        System.out.println((int)b);
        if(b>=25){
            System.out.print("Obesity");
        }
        
    }
}