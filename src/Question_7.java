                                // Question 7
 /* Rami got n cubes. He decided to build a pyramid from them. Rami wants to build the
 pyramid as follows: the top level of the pyramid must consist of 1 cube , the second
 level must consist of 1 + 2 = 3 cubes , the third level must have 1 + 2 + 3 = 6 cubes , and so on.
 Thus, the i-th level of the pyramid must have 1 + 2 + ... + ( i - 1 ) + i cubes.
 Rami wants to know what is the maximum height of the pyramid that he can make using the
 given cubes. Write the code and find time complexity .
  */
public class Question_7 {
    // Solution
    public static void main(String[] args) {
       int i,n,sum;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        sum=0;
        i=0;
        while(true)
        {
            i++;
            sum=i*(i+1)*(i+2)/6;  
            if(sum>n)
            {
                break;
            }
        }
        System.out.println(i-1);

    }



}
