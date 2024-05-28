import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hm = sc.next();
        String [] time = hm.split(":");
        System.out.printf("%d:%d",Integer.parseInt(time[0])+1,Integer.parseInt(time[1]));

    }
}