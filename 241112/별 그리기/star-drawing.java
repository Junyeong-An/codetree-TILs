import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int l=0;l<n-1;l++){
                for(int m=0;m<l+1;m++){
                    System.out.print(" ");
                }
                for(int o=0;o<(2*n)-(2*l)-3;o++){
                    System.out.print("*");
                }
                System.out.println();
        }
        sc.close();
    }
}