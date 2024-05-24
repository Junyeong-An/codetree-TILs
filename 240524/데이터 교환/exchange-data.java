public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tempb;
        int tempc;
        tempb = b;
        b = a;
        tempc = c;
        c = tempb;
        a = tempc;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}