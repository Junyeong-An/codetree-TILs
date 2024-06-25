import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aStatus = sc.next();
        int aTemp = sc.nextInt();
        String bStatus = sc.next();
        int bTemp = sc.nextInt();
        String cStatus = sc.next();
        int cTemp = sc.nextInt();
        if((aStatus.equals("Y") && aTemp>=37 && bStatus.equals("Y") && bTemp>=37) || (bStatus.equals("Y") && bTemp>=37&& cStatus.equals("Y") && cTemp>=37) || (aStatus.equals("Y") && aTemp>=37 && cStatus.equals("Y") && cTemp>=37))
        System.out.print("E");
        else
        System.out.print("N");
    }
}