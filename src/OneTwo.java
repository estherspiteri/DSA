public class OneTwo {
    public void oneTwo() {
        ArrayGenerator g = new ArrayGenerator();

        //initialising arrays with random numbers
        int [] A = g.intArrayGenerator(270, 1024, 0);
        int [] B = g.intArrayGenerator(300, 1024, 0);

        shellSort(A);
        System.out.println("Sorted through Shell Sort A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A" + i + "\t" + A[i]);
        }

        quickSort(B, 0, B.length - 1);
        System.out.println("\nSorted through Quick Sort B:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B" + i + "\t" + B[i]);
        }

        int [] C = mergeSort(A, B);
        System.out.println("\nSorted through Merge Sort C:");
        for (int i = 0; i < A.length+B.length; i++) {
            System.out.println("C" + i + "\t" + C[i]);
        }
    }

    //function to sort array using shellSort
    public void shellSort(int array[]) {
        int n = array.length;

        //start with a gap of n/2 each time reducing it by /2
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //elements to right of the gap are placed in appropriate position when necessary
            for (int i = gap; i < n; i += 1) {
                //elements to right of the gap are stored in temporary variable
                int temp = array[i];

                /*earlier sorted elements are shifted up until
                  the correct location for array[i] is found*/
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Put temp (the original array[i]) in its correct
                // location
                array[j] = temp;
            }
        }
    }

    //recursive quick sort
    public  void quickSort(int[] arr, int start, int end) {

        int partition = partition(arr, start, end);

        //sorting partitions to left of pivot
        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }
        //sorting partitions to right of pivot
        if (partition + 1 < end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        //initialising pivot
        int pivot = arr[end];

        //checking whether elements before pivot are smaller
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                /*initialising temporary variable with 1st element of partition in order
                   to place the new smaller element in place of the previous 1st element*/
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        /*placing pivot in correct position where elements on the left are smaller and those
          on the right are greater*/
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    //merge sort with 2 arrays
    public static int[] mergeSort(int[] L, int[] R) {
        int[] array = new int[L.length + R.length];
        int i = 0, j = 0, k = 0;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of L or R if any
        while (i < L.length) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < R.length) {
            array[k] = R[j];
            j++;
            k++;
        }
        return array;
    }
}
