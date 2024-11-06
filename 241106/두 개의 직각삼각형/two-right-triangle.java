import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
  
        
        for(int j=0;j<n;j++){ // 중간 대문? 출력
            for(int k=0;k<n-j;k++){
                System.out.print("*");
            }
            for(int l=0;l<2*j;l++){
                System.out.print(" ");
            }
            for(int m=0;m<n-j;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}