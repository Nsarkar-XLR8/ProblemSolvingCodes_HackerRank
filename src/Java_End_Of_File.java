/* End of file (or EOF) means there are no more data that can be read from a data source.
To check if a specific type of input is available or not you can use the hasNext() method of the Scanner class. */


import java.util.Scanner;


//
public class Java_End_Of_File {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()){
            i++;
            System.out.println(i+" "+sc.nextLine());
        }
    }
}
