import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// 공백 별
// 2  1
// 1  3
// 0  5
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}