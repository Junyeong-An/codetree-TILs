import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        int sum = 0;
        int zero = 0;

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(zero !=0){
                break;
            }
            else if(n == 0){
                zero++;
                continue;
            }
            else if(n%2==0){
                count++;
                sum+=n;
            }
        }
        System.out.print(count+" "+sum);
    }
}