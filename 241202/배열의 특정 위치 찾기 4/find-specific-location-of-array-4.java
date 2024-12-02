import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        int sum = 0;

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n == 0){
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