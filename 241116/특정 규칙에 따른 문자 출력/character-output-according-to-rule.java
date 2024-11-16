import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("@ ");
            }
            System.out.println();

        }
        for(int l=0;l<n-1;l++){
            for(int m=0;m<n-1-l;m++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}