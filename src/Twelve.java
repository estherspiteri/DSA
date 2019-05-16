public class Twelve {
    public void twelve(int n){
        if (n > 0) {
            //setting up variables to satisfy base case of the first number in the Fibonacci sequence as 1
            int sum = 1;
            int temp;
            int prev = 1;
            int total = 1;

            if (n != 1) {
                //incrementing total to satisfy base case of the second number in the Fibonacci sequence as 1 thus summation is of 2
                total++;
                for (int i = 1; i < n - 1; i++) {
                    temp = sum; //storing latest sum in temporary variable
                    sum = temp + prev; //adding the 2 previous elements to create the next Fibonacci number
                    prev = temp; //setting the previous sum in previous
                    total += sum; //adding the sum of the Fibonacci sequence to total
                }
            }
            System.out.println("Fibonacci Summation up to N = " + n + " :\n" + total);
        }
        else {
            System.out.println("Input must be greater than zero!");
        }
    }
}
