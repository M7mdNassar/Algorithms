                                // Question 6
 /*  Write a BF algorithm to check if the two strings have the same characters but not
 necessary in the same order. For example, "army" and "mary" , both have the same characters.
 What is the time complexity?
  */
import java.util.*;
public class Question_6 {

    // Solution

    static boolean check (String s1 , String s2){
        if (s1.length() != s2.length())
            return false;
        char []a1 = s1.toLowerCase().toCharArray();
        char []a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals( a1 , a2 );
    }

    // another solution

    static boolean isAnagramCounting(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }
        int CHARACTER_RANGE = 256;
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
// test
    public static void main(String[] args) {
        String s1 = "army" , s2 = "mary";

        boolean flag = check(s1 , s2);
        if (flag == true)
            System.out.println("Match !");
        else
            System.out.println("Not match");


        System.out.println( isAnagramCounting(s1 , s2));
    }
}
