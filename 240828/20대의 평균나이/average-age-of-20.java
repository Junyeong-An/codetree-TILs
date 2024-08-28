import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumAge = 0;
        int count =0;
        while(true){
            int age = sc.nextInt();
            if(age>=30 || age <=19){
                System.out.printf("%.2f",(double)sumAge/count);
                break;
            }
            sumAge+= age;
            count++;
            


        }
    }
}