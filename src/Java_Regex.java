

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java_Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

/*
    [01]? \\ d {1,2} ----->>>> Matches numbers 0 - 199
    2 [0-4] \\ d     ----->>>> Matches numbers 200 - 250
    25 [0-5]         ----->>>> Matches numbers 250 - 255
 */

//Write your code here

class MyRegex {
    String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";

    public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
}