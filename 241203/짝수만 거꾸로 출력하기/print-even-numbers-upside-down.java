import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num %2==0){
                arr[count] = num;
                count++;
            }            
        }
        for(int j=count-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}