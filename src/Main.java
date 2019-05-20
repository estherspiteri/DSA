public class Main {

    public static void main(String[] args) {
        ArrayGenerator g = new ArrayGenerator();

        System.out.println("Task 1 (A & B) & Task 2 (C) :");
        OneTwo task = new OneTwo();
        task.oneTwo();

        System.out.println();

        //N = size of array
        Three task3 = new Three();
        //generating array
        System.out.println("Task 3 array:");
        int[] A3 = g.intArrayGenerator(8, 20, 0);
        task3.three(A3);
        System.out.println();

        //passing sorted array
        int [] A3Sorted = {1,2,3,4,5,6,7};
        System.out.println("Sorted array:\n[ 1, 2, 3, 4, 5, 6, 7 ]");
        task3.three(A3Sorted);

        System.out.println();

        //a X b = c X d and a ≠ b ≠ c ≠ d
        Four task4 = new Four();
        System.out.println("Task 4  a X b = c X d and a ≠ b ≠ c ≠ d : ");
        int [] A4 = g.intArrayGenerator(60, 1024, 1);
//        //to generate array from 0 to 99
//        int [] A4 = new int[100];
//        for (int i = 0; i < A4.length; i++) {
//            A4[i] = i+1;
//        }
        task4.four(A4);

        System.out.println();

        //RPN using ADT Stack
        // Must include spacing!
        System.out.println("Task 5 :");
        Five task5 = new Five();
        task5.five("15 7 1 1 + - / 3 x 2 1 1 + + -");

        System.out.println();

        Six task6 = new Six();
        //checks if integer N is prime
        System.out.println("\nTask 6 :\nInput is a prime : "+task6.primeCheck(29));
        //Sieve of Eratosthenes
        task6.sieveOfEratosthenes(30);

        System.out.println();

        //binary tree
        Seven task7 = new Seven();
        System.out.println("Task 7 :");
        task7.seven();

        System.out.println();

        //approximation to the square root of n
        Eight task8 = new Eight();
        System.out.println("Task 8 :");
        task8.eight(542);

        System.out.println();

        //repeated integers
        Nine task9 = new Nine();
        //generating array
        System.out.println("Task 9 array :");
        int [] A9 = g.intArrayGenerator(10, 9, -5);
        task9.nine(A9);

        System.out.println();

        //largest number - recursive
        Ten task10 = new Ten();
        //generating array
        System.out.println("Task 10 (recursive) array :");
        int [] A10 = g.intArrayGenerator(10, 1024, -92);
        task10.ten(A10);

        System.out.println();

        //cos(x) --> [c] or sin(x) --> [s] expansion for n elements
        Eleven task11 = new Eleven();
        System.out.println("Task 11 :");
        task11.eleven('c', 2.3, 6);
        task11.eleven('s', 3.4, 5);

        System.out.println();

        //fibonacci
        Twelve task12 = new Twelve();
        System.out.println("Task 12 :");
        task12.twelve(11);
    }
}
