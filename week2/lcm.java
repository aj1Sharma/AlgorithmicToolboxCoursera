import java.util.Scanner;
import java.math.BigInteger;
class lcm {
    static BigInteger lcM(String a, String b) {
        BigInteger s = new BigInteger(a);
        BigInteger p = new BigInteger(b);
        BigInteger mul = s.multiply(p);
        BigInteger gcd = s.gcd(p);
        BigInteger lcM = mul.divide(gcd);
        return lcM;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a  = scan.next();
        String b = scan.next();
        System.out.print(lcM(a,b));
    }
}