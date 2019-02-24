import java.util.Scanner;
class gdc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        while (b!=0) {
            long x = a%b;
            a = b;
            b = x;
        }
        System.out.print(a);
    }
}