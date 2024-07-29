import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x%2==1 && x%3==0){
                sum+=x;
            }
        }
        System.out.print(sum);
    }
}