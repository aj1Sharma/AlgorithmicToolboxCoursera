import java.util.Scanner;
class fibb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int t1 = 0;
        int t2 = 1;
        int val = 0;
        for(int i = 1; i<n; i++) {
            val = t1 + t2;
            t1 = t2;
            t2 = val;
        }
        if (n == 0) {
            t2 = 0;
        }
        System.out.println(t2);

    }
}