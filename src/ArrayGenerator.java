public class ArrayGenerator {
    public int[] intArrayGenerator(int N, int max, int min){
        int[] A = new int[N];
        System.out.print("[ ");
        for (int i = 0; i < N; i++) {
            A[i] = (int) (Math.random() * max)+min ;
            System.out.print(A[i]);
            if (i != N-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        return A;
    }
}
