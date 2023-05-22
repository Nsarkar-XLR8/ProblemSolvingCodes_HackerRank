/* Inheritance is one of the main features of object-oriented programming in CPP, allowing us to inherit another class's properties.
There are mainly five types of inheritance in c++: single inheritance, multiple inheritance, multilevel inheritance, 
hybrid inheritance, and hierarchical inheritance. */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic {
    public int add ( int x,int y){
        int sum = x + y;
        return sum;
    }
}

class Adder extends Arithmetic{

}

public class Java_Inheritance_II{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
