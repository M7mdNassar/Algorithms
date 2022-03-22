import java.util.Scanner;

                          //Question 1
/* A soldier want to W bananas in the shop. He has to pay K dollars for
   the first banana, 2K dollars for the second one and so on
   ( in other words, he has to pay i*k dollars for the i-th banana ).

   He has N dollars, How many dollars does he have to borrow from his friend
   soldier to buy W bananas ?

   write the code and find time complexity.
 */

public class Question_1
{
    //Solution

   static void borrow (int sum , int n) {
        int borrow;
        if(sum>n){
            borrow=sum-n;
            System.out.println("He need to borrow form his friend soldier: "+borrow +" $");
        }
        else{
            System.out.println("He have enough money :)");
        }
    }

    //test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w , k , n ;
        System.out.println("Enter W Value : ");
        w = input.nextInt();
        System.out.println("Enter K Value : ");
        k = input.nextInt();
        System.out.println("Enter N Value : ");
        n = input.nextInt();

        int sum=0;
        for(int i=1 ; i<=w ; i++){
            sum+=i*k;
        }
        borrow(sum , n);
        // borrow method need constant time ... and this loop need O(n)
        // Time complexity: O(n) + O(1)  ==> Time is O(n).
    }

}
