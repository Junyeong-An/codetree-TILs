import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b<=c && b<=a)
        System.out.print(b);
        else if(a<=c && a<=b)
        System.out.print(a);
        else
        System.out.print(c);
    }
}