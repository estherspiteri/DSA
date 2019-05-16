import java.util.*;

public class Five {
    public void five(String num) {
        //creates stack object
        Stack st = new Stack();
        int count = 0;
        String number = "";
        boolean digit = false; //to be able to accept multiple digit integers

        //loops till input reaches end
        while (count < num.length()) {
            //if character in string is a digit
            if (Character.isDigit(num.charAt(count))) {
                number = number + num.charAt(count);
                digit = true;
            }
            //if character is an empty space and digit flag is true
            else if (num.charAt(count) == ' ' && digit) {
                //pushes numeric value to stack
                st.push(Integer.parseInt(number));
                //reset number String to empty
                number = "";
                digit = false;
            }
            //if character in string is an operator
            else if (num.charAt(count) == '+' || num.charAt(count) == '-' || num.charAt(count) == 'x' || num.charAt(count) == '/') {
                //calls method to work out arithmetic operation and pushes result to stack
                st.push(operationCheck(st, num.charAt(count)));
            }
            else if (num.charAt(count) != ' '){
                System.out.println(num.charAt(count)+" is not accepted as an input!");
                return;
            }
            count++; //increment count to check next character in string
        }

        //print final popped result
        System.out.println("RPN : \n" + num + " = " + st.pop());
    }

    public static int operationCheck(Stack st, char operation) {

        switch (operation) {
            case '+':
                return (st.pop() + st.pop()); //addition

            case '-':
                return (-st.pop() + st.pop()); //subtraction

            case 'x':
                return (st.pop() * st.pop()); //multiplication

            case '/':
                int last = st.pop();
                return (st.pop() / last); //division

            default:
                System.out.println("Invalid operator!");
                return 0;
        }
    }
}
class Stack{
    ArrayList <Integer> st = new ArrayList<>();

    public void push(Integer n){
        st.add(n);
        DisplayStack(this.st);
    }

    public Integer pop(){
        DisplayStack(this.st);

        if(st.isEmpty()){
            return null;
        }
        return st.remove(st.size()-1);
    }

    private void DisplayStack(ArrayList <Integer> st){
        for (int i = st.size(); i > 0; i--) {
            System.out.println("Stack["+(i-1)+"] --> "+st.get(i-1));
        }
        System.out.println();
    }
}