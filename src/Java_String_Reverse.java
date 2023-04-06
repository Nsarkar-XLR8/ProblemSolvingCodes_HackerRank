import java.io.*;
import java.util.*;

/*
        A palindrome is a word, phrase, number, or other sequence of
         characters which reads the same backward or forward.
 */
public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reverseStr = "";

        for(int i=A.length()-1;i>=0;--i){
            reverseStr = reverseStr + A.charAt(i);
        }
        if(A.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}



