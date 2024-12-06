import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int evenSum = 0;
        int sum = 0;
        int count = 0;
        double avg = 0;
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=1;j<10;j+=2){
            evenSum += arr[j];
        }
        for(int k=2;k<10;k+=3){
            sum += arr[k];
            count++;
        }
        avg = (double)sum/count;
        System.out.printf("%d %.1f",evenSum,avg);
    }
}