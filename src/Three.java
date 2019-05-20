public class Three {
    public void three(int [] A){
        boolean sorted = true;

        System.out.println("Extreme Points :");
        //iterating without including first and last elements
        for (int i = 1; i < A.length-1; i++) {

            //comparing for conditions needed to satisfy
            //extreme points
            if((A[i] > A[i-1] && A[i] > A[i+1]) ||
                    (A[i] < A[i-1] && A[i] < A[i+1])){

                //printing extreme points
                System.out.print(A[i]+" ");

                sorted = false;
            }
        }
        if(sorted){
            System.out.println("SORTED");
        }

        System.out.println();
    }
}
/*The only way for an array to have no extreme points is to be either sorted in
* ascending or descending order and therefore the elements are all either
* (A[i] > A[i-1] && A[i] < A[i+1]) or (A[i] < A[i-1] && A[i] > A[i+1]).
* These properties contradict those required for extreme points thus implying
* that an array has no extreme points if and only if it is sorted*/
