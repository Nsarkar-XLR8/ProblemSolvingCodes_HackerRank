

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Exception_Handling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Java_Exception_Handling  */
            Scanner sc = new Scanner(System.in);
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(x / y);
            }catch (ArithmeticException | InputMismatchException e){
                if (e instanceof ArithmeticException){
                    System.out.println("java.lang.ArithmeticException: / by zero");
                } else if (e instanceof InputMismatchException){
                    System.out.println("java.util.InputMismatchException");
                }

            }
            sc.close();







    }
}
