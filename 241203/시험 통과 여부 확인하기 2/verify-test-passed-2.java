import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();

        int[] arr = new int [4];

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<4;j++){
                int score = sc.nextInt();
                sum += score;
            }
            int avg = sum/4;
            if(avg>=60){
            System.out.println("pass");
            count++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.print(count);



    }
}