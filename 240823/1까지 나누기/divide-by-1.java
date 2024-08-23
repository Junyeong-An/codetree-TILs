import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        int x = n/i;
        while(true){
            if(x<=1){
                System.out.print(sum);
                break;
            }
            x = x/i;
            sum++;
            i++;
        }
    }
}