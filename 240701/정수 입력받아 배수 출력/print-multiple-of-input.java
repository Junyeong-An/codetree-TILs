import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=5;i++){
            if((n*i)%n==0)
            System.out.print(n*i);
            System.out.print(" ");

        }

    }
}