import java.util.*;

public class Java_Substring_Comparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i=0;i<s.length()-k+1;i++){
            a.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(a);
        smallest = a.get(0);
        largest = a.get(a.size()-1);
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0, k);
        String maxSubstring = line.substring(0, k);
        for (int i = 1; i < line.length() - k + 1; i++) {
            String sub = line.substring(i, i + k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
    }
}

 */
