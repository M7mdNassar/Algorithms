                                // Question 5
 /*  Maximum sub array sum problem is to find the sub array with maximum sum.
     For example, if the given array is {-2 , -5 , 6 , -2 ,-3 , 1 , 5 , -6 }
                                                  |__________________|
     then the maximum sub array sum is 7 (see the elements that underline )
     Write a BF algorithm for this problem, what it is time complexity.
  */

public class Question_5 {
    // Solution
    // Max Sub array called also kadane algorithm :)
    public static int kadane(int[] A)
    {
       int ans = Integer.MIN_VALUE , s = 0 ;
       for (int i : A){
           s += i ;
           ans = Integer.max(ans , s);
           s = Integer.max(s,0);
       }
       return ans;
    }
    // Time complexity is O(n) :)

    //test
    public static void main(String[] args) {
        int[] A = {-2 , -5 , 6 , -2 ,-3 , 1 , 5 , -6 };

        System.out.println("The sum of contiguous subarray with the " +
                "largest sum is " + kadane(A));
    }

}
