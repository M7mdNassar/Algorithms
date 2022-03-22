                          // Question 4
 /*  Assume the list has n integer items. Write a decrease and conquer algorithm to
     rearrange them in which the odd items precede the even items in the list
  */
public class Question_4 {
    // Solution

   static int odd=0 , even = 5;
    static int rearrange(int arr[], int []nArray , int n){
        if(n<0)
            return 0;
        if(arr[n] % 2 == 1)
            nArray[odd++]=arr[n]; //odd first
        else
            nArray[even--]=arr[n];  //even last
        return rearrange(arr,nArray,n-1);
    }
    //test
    public static void main(String[] args) {
        int []arr ={ 10 , 20 , 30 ,11 , 13 , 15 };
        int []nArray = new int [6];
        rearrange(arr,nArray,5);
        for (int i :nArray)
            System.out.print(i+" ");
    }
}
