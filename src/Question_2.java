
                               // Question 2
  /* Apply insertion sort to sort the string "algorithm" in alphabetical order
  and find the number of comparisons.
   */
public class Question_2 {

    //Solution
   static void inserionSort (char[] s){
        char key;
        int j , comparison = 0;
        for (int i=1 ; i<s.length ; i++) {
            key = s[i];
            j = i - 1;
            comparison++;
            while (j >= 0 && key < s[j]) {
                s[j + 1] = s[j];
                j--;
                comparison++;
            }
            s[j + 1] = key;

        }
       System.out.println("Number of comparison is | "+comparison+" |");
    }

    //test
    public static void main(String[] args) {

        char []s = { 'a' , 'l' ,'g' , 'o' , 'r' , 'i' , 't' , 'h', 'm'};
        System.out.println("The string is : ");
        for (char i : s)
            System.out.print(i+" ");

        System.out.println("\nAlphabetical order using insertion sort : ");
        inserionSort(s);
        for (char i : s)
            System.out.print(i+" ");


    }
}
