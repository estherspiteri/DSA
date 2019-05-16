public class Six {
    public boolean primeCheck(int N){
        if (N <= 1){
            return false;
        }
        else if (N == 2){
            return true;
        }

        //if N is not divisible by 2 no need to check if number is divisible by even numbers
        if (N%2 != 0){
            //if square root is a whole number than it is not prime
            if(Math.sqrt(N)%1 == 0){
                return false;
            }
            else {
                //if int N is divisible by any number greater than 2 up to the square root of the number than it is not a prime
                for (int i = 3; i <= Math.sqrt(N); i += 2) {
                    if (N % i == 0) {
                        return false;
                    }
                }
            }
        }
        else{
            return false; //if divisible by 2 & therefore is even
        }

        //if N is not divisible by any other positive integer other than 1, then it is a prime
        return true;
    }

    public void sieveOfEratosthenes(int N){
        if(N > 1) {
            //initialising array with integers from 2 to N
            int[] array = new int[N - 1];
            int count = 2;
            for (int i = 0; i < array.length; i++) {
                array[i] = count;
                count++;
            }

            int length = array.length;

            for (int i = 0; i < length; i++) {
                count = array[i]; //initialising count with elements in current updated array position

                //comparing with the following elements in the array
                for (int j = i+1; j < length; j++) {
                    //if element is divisible by count then it is not a prime and entire array is shifted to the left
                    if (array[j] % count == 0) {
                        for (int k = j; k < length - 1; k++) {
                            array[k] = array[k + 1];
                        }
                        //length of array is decreased to ignore extra space at end of array
                        length--;
                    }
                }
            }
            //printing valid integers in array which are prime numbers
            System.out.println("Prime numbers less than or equal to input are : ");
            for (int i = 0; i < length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}

//Optimizations applied to primeCheck() included : not dividing by even numbers if number is odd
//                                               : checking until square root of given number
//                                               : returning false if square root of given number is a whole number