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



