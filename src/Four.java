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
    }
}
