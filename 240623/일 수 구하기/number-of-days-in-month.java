import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2)
        System.out.print(28);
        else if(n==7 || n== 8 )
        System.out.print(31);
        else if(n<=8)
            if(n%2==1)
                System.out.print(31);
            else
                System.out.print(30);
        else if(n%2==1)
            System.out.print(30);
        else
            System.out.print(31);

    }
}