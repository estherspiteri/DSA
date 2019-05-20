import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Four {
    public void four(int [] A) {
        Hashtable<Integer, Set<String>> h = new Hashtable<>();

        //sorting array to easily identify repeated integers
        OneTwo sorting = new OneTwo();
        sorting.quickSort(A, 0, A.length - 1);

        int [] tempArray = new int [A.length];
        int p =0;

        //to ignore repeated integers in the array
        for (int i = 0; i < A.length-1; i++) {

                // If current element is not equal
                // to next element then store that
                // current element
                if (A[i] != A[i+1]) {
                    tempArray[p++] = A[i];
                }
        }

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        tempArray[p++] = A[A.length-1];

        // Modify original array
        for (int i=0; i< p; i++) {
            A[i] = tempArray[i];
        }

        int length = p;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                //if elements not equal
                if (A[i] != A[j]) {

                    //if key or product already exists
                    if (h.containsKey(A[i] * A[j])){
                        //concatenate product to already existing ones
                        h.get(A[i] * A[j]).add(A[i] + " x " + A[j]);
                    }
                    //if key does not exist
                    else{
                        //creates new key
                        Set<String> set = new HashSet<>();
                        set.add(A[i] + " x " + A[j]);

                        h.put(A[i] * A[j], set);
                    }
                }
            }
        }

        System.out.println(h);
        Set<Integer> keys = h.keySet();

        //iterate through all the keys
        for(Integer key: keys){
            //if more than one set of products
            if (h.get(key).size() != 1){
                //if 2 sets of products output combinations
                if (h.get(key).size() == 2){
                    System.out.println(h.get(key));
                }
                //output all combinations between the products
                else {
                    int k = 0;
                    for (String s1 : h.get(key)) {
                        int l = 0;
                        for (String s2 : h.get(key)) {
                            if (l > k && !s1.equals(s2)) {
                                System.out.println("["+s1 + ", " + s2+"]");
                            }
                            l++;
                        }
                        k++;
                    }
                }
            }

        }


    //
//        int prodLength = 0;
//        int count = length;
//
//        while(count != 0){
//            count--;
//            prodLength += count;
//        }
//
//        int [] products = new int[prodLength];
//
//        for (int i = 0; i < length-1; i++) {
//            for (int j = i; j < length-1; j++) {
//                products[count] = A[i] * A[j+1];
//                count++;
//            }
//        }
//
//        int check = length;
//        int iCount1 = 0;
//        int iCount2 = 1;
//        int iCount2Original = iCount2;
//
//        int jCount1 = 1;
//        int jCount2 = 2;
//        int checkj = length;
//        int jCount2Original = jCount2;
//
//        for (int i = 0; i < count; i++) {
//            for (int j = i + check - 1; j < count; j++) {
//                //checking if the product is repeated
//                if (products[i] == products[j]) {
////                    System.out.println(A[iCount1]+" x "+A[iCount2] +" = "+ A[jCount1]+" x "+A[jCount2]);
//                }
//                if (jCount2 == checkj - 1) {
//                    jCount1++;
//                    jCount2 = jCount2Original++;
//                }
//                else{
//                    jCount2++;
//                }
//                checkj--;
//
//
//            }
//            check--;
//
//            if (i == check-1) {
//                iCount1++;
//                iCount2 = iCount2Original++;
//            }
//            else{
//                iCount2++;
//
//            }
//
//
//            jCount1 = iCount2Original;
//            jCount2 = iCount2Original;
//            jCount2++;
//        }

        //////////////////

//        //iterates till half the array
//        for (int i = 0; i < A.length/2; i++) {
//            //to find initial pair
//            for (int j = i; j < A.length; j++) {
//                //to find another pair with same product
//                for (int k = i+1; k < A.length; k++) {
//                    for (int l = k; l < A.length; l++) {
//
//                        //checks that 2 distinct pairs of integers
//                        //((a,b),(c,d)) where a X b = c X d and a ≠ b ≠ c ≠ d
//                        if (A[i]*A[j] == A[k]*A[l] && A[i]!=A[j] && A[k]!=A[l] &&
//                            A[i]!=A[k] && A[i]!=A[l] && A[j]!=A[k] && A[j]!=A[l]){
//
//                            System.out.println(A[i]+" x "+A[j] +" = "+ A[k]+" x "+A[l]);
//                        }
//                    }
//                }
//            }
//        }
    }
}
