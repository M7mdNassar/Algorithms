                            // Question 3
 /*  Write a BF algorithm that checks if there is a pair of items in an array
     that adds up to exactly s . find time complexity
  */

import java.util.Scanner;
public class Question_3 {
    // solution
    static boolean checkPair (int []arr , int s){
        for (int i=0 ; i < arr.length - 1 ; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = {0, 0, 1, 4, 1};
        int s;
        System.out.println("Enter S value : ");
        s=input.nextInt();

        boolean flag = checkPair(arr , s);
        if (flag)
            System.out.println("The sum pair exists equivalent to | "+s+" |");
        else
            System.out.println("No pair exists for | "+s+" |");
    }
}
