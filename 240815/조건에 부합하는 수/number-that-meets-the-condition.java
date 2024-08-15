import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int b = i/8;
            int c = i%7;
            if(i%2==0 && i%4!=0 || b%2==0 || c<4){
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
        
    }
}