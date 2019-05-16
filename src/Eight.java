public class Eight {
    public void eight(int n){
        if(n >= 0) {
            double sqrtPrev;
            double sqrt = n;

            if(n != 0 && n!= 1) {
                //first square root number should be the input / 2
                sqrt = n/2.0;

                do {
                    //store previous square root
                    sqrtPrev = sqrt;

                    //calculate square root
                    sqrt = ((sqrtPrev + (n / sqrtPrev)) / 2);
                } while ((sqrtPrev - sqrt) != 0);
            }

            System.out.println("Square root of " + n + " is " + sqrt);
        }
        //if input is negative
        else{
            System.out.println("There is no real solution for the square root of a negative number!");
        }
    }
}
