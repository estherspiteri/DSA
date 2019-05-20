public class Eleven {
    public void eleven(char choice, double x, int n){
        if (choice == 'c'){
            cosine(x, n);
        }
        else if (choice == 's'){
            sine(x, n);
        }
        else{
            System.out.println("Invalid input! Enter c (cosine) or s (sine) for the corresponding series expansion.");
        }
    }

    void cosine(double x, int n){
        double cos = 0;
        int factorial;

        //to add up the terms of the cosine series
        for (int i = 0; i <= n; i++) {
            //calculating factorial in denominator
            factorial = factorial(2 * i);
            //working out term and adding it to cosine variable
            cos += Math.pow(-1, i) * Math.pow(x, 2*i) / factorial;
        }

        System.out.println("cos("+x+") = "+cos);
    }

void sine(double x, int n){
    double sine = 0;
    int factorial;

    //to add up the terms of the cosine series
    for (int i = 0; i <= n; i++) {
        //calculating factorial in denominator
        factorial = factorial((2*i)+1);
        //working out term and adding it to sine variable
        sine += Math.pow(-1, i) * Math.pow(x, (2*i)+1) / factorial;
    }

    System.out.println("sin("+x+") = "+sine);
}

    int factorial (int num){
        //checking for standard 0! & 1!
        if (num == 0 || num == 1){
            return 1;
        }

        int result;

        //recursive function to work out factorial of previous numbers
        result = factorial(num-1)*num;
        return result;
    }
}

//does not hold for large values of n due to integer's size