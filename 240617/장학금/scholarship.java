import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstScore = sc.nextInt();
        int secondScore = sc.nextInt();
        if( firstScore>=90 && secondScore>=95)
        System.out.print(100000);
        else if( firstScore>=90 && secondScore>=90)
        System.out.print(50000);
        else
        System.out.print(0);
    }
}