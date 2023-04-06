import java.util.Scanner;

public class Java_String_Token {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tokens = s.split("[^A-Za-z]");

        int numToken = 0;

         for (int i = 0;i<tokens.length;i++) {
            if (tokens[i].length() > 0) {
                  numToken++;
             }
         }
         System.out.println(numToken);
        for (int i = 0;i<tokens.length;i++) {
            if (tokens[i].length() > 0) {
                System.out.println(tokens[i]);
            }
        }
    }
}
