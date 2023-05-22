
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;



public class Java_Primality_Test {


    public boolean isProbablePrime(int n){
        int i;
        for ( i = 2;i < n/2;i++){
            if (n <= 1) return false;
             }
        if (n % i == 0 ){
            System.out.println("Not Prime");

        }else {
            System.out.println("Prime");
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Java_Primality_Test jpt = new Java_Primality_Test();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = jpt.isProbablePrime(n);
    }
}
