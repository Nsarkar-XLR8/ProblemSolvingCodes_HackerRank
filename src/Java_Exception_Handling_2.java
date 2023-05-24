
import java.util.Scanner;

class Calculator {

    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        }else if(n==0 && p ==0){
            throw new Exception("n and p should not be zero.");
        }

        else {
            return ((int)Math.pow(n,p));
        }
    }
}




public class Java_Exception_Handling_2 {
    public static final Calculator calculator = new Calculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}