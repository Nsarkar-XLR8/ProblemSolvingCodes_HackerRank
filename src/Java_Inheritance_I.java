/* Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son.
Inheritance in Java is a process of acquiring all the behaviours of a parent object. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }

}

public class Java_Inheritance_I {

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
