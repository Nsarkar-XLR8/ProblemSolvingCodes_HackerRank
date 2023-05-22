/* If else statement is a condition statement that is used in the execution of a computer program in pre-defined rules.
The if-else statement helps you to run a specific block of a program if the condition is true or else, it will check other conditions. */

import java.util.*;

public class Java_If_Else {





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a%2!=0){
            System.out.println("Weird");

        } else if (a%2==0) {
            System.out.println("Not Weird");

        } else if ((a%2==0)&&(a>2 && a <=5)) {
            System.out.println("Not Weird");

        } else if ((a%2==0)&&(a>6&&a<=20)) {
            System.out.println("Weird");

        } else if (a%2==0 && a > 20) {
            System.out.println("Not Weird");
        }
        sc.close();
    }
}



