import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean x = false;

        for(int i=a;i<=b;i++){
            if(1920%i==0 || 2880%i==0){
                x=true;
            }
        }
        if(x==true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
}