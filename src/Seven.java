import java.util.Scanner;

public class Seven {
    public void seven(){
        int input;
        TreeImplementation bt = new TreeImplementation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Binary Tree");

        do{
            System.out.println("Enter integer. [To stop enter 00]");
            if(sc.hasNextInt()) {
                input = sc.nextInt();

                if (input != 00) {
                    bt.add(input);
                }
            }
            else{
                System.out.println("Input must be a digit!");
                return;
            }
        } while (input != 00);
    }
}
