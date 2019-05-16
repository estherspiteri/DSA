public class Ten {
    public void ten(int [] A) {
        //setting variables for recursive function
        int max = A[0];
        int count = 0;
        max=largestNum(A, max, count);

        System.out.println("Largest number in array is: "+max);

    }

    public int largestNum(int []A, int max, int count){
        //checking if end of array has been reached
        if (count<A.length){
            //comparing array element to stored maximum
            if(A[count]>max) {
                max = A[count]; //storing new maximum
            }
            count++;
            //recursive call with updated count and possibly updated maximum
            max = largestNum(A, max, count);
            return max;
        }
        else{
            return max;
        }
    }
}
