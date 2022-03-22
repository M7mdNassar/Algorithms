                                //Question 8
/*  How do you find the missing number in a given integer array of 1 to 100.
Can you solve it in O(n) time complexity ?

 */

public class Question_8 {
    // Solution

    // method #1
    static int getMissingNo(int a[], int n)
    {
        int n_elements_sum = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < n - 1; i++)
            sum += a[i];

        return n_elements_sum - sum;
    }


    // method #2
    static int getMissing (int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }
    //test
    public static void main(String[] args) {
        int []arr = {1 , 2 , 4 , 5 ,6};
        System.out.println(getMissingNo(arr , arr.length));
        System.out.println(getMissing(arr , arr.length));

    }

}
