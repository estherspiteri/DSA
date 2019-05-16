public class Nine {
    public void nine(int [] A){
        boolean printed = false;

        //sorting array to easily identify repeated integers
        OneTwo sorting = new OneTwo();
        sorting.quickSort(A, 0, A.length-1);

        //setting counter to initial array element
        int count = A[0];

        System.out.println("Integers in the array that are repeated more than once : ");
        for (int i = 1; i < A.length; i++) {
            //checking if the number is repeated and if it has already been printed
            if (A[i] == count && !printed){
                System.out.println(A[i]);
                printed = true;
            }
            //resetting printed flag and updating the count to match the next existing integer
            else if (A[i] != count){
                printed = false;
                count = A[i];
            }
        }
    }
}

//                while (count != A[i]){
//                    count++;
//                }