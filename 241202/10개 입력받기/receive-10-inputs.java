import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        double avg = 0;

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            arr[i] = n;
            sum+=arr[i];
            count++;
        }
        avg = (double)sum/count;

        System.out.printf("%d %.1f",sum,avg);
    }
}