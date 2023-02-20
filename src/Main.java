
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int meter = 0;
        double feet;
        double mile;
        double conversionFactor = 1606;
        double inches;
        //prompt user to enter the variables
        System.out.println("Enter the number of meters:");
        //take the user input
        if (input.hasNextInt()) {
            meter = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        //do math
        feet = meter * 3.281;
        mile = meter / conversionFactor;
        inches = meter * 39.37;
        System.out.println(meter + " meters is " + feet + " feet.");
        System.out.println(meter + " meters is " + mile + " miles.");
        System.out.println(meter + " meters is " + inches + " inches.");
    }
}