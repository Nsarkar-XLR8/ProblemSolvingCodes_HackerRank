/* The java.util.Currency class represents a currency.Following are the important points about Currency − Currencies are identified by their ISO 4217 currency codes. 
The class is designed so that there's never more than one Currency instance for any given currency, this is the reason behind no public constructor. */


import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // Write your code here.
        Locale indiaLo = new Locale("EN","IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLo);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);



        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
