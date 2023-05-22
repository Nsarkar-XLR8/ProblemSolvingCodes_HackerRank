/* instanceof is a binary operator we use to test if an object is of a given type.
The result of the operation is either true or false. It's also known as a type comparison operator because it compares the instance with the type. 
Before casting an unknown object, the instanceof check should always be used. */



/* equals() it (the String s )ran it's own logic to determine that it's the same object. In the case of String, it will compare it character by character.
instanceof is something else entirely, and will tell you if an object is an instance of a certain type of object, e.g. "foo" instanceof String is true. */


import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class Java_Instanceof_keyword{

    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student){
            a++;}
            if(element instanceof Rockstar){
            b++;}
            if(element instanceof Hacker){
            c++;}
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
