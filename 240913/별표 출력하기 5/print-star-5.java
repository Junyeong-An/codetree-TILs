import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int m=0;m<n-i;m++){
                for(int j=0;j<n-i;j++){
                System.out.print("*");
                }
            for(int k=n-1;k<n;k++){
                System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}