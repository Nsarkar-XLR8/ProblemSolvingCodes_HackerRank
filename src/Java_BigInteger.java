import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        BigInteger A =  new BigInteger(sc.nextLine());
        BigInteger B =  new BigInteger(sc.nextLine());

        BigInteger C,D;
        C = A.add(B);
        D = A.multiply(B);

        System.out.println(C);
        System.out.println(D);





    }
}