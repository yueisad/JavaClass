import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramExceptions {
    public static void main (String[] args) {
        
        //variables 
        Scanner sc = new Scanner(System.in);
        int numSteps;  //user input 
        double numMiles; //calculated value

        try {
            //prompt user for input
            System.out.print("Enter the number of steps: ");
            numSteps = sc.nextInt();

            if (numSteps < 0) {
                throw new Exception("Negative number of steps");
            }
            else if (numSteps > 50000) {
                throw new Exception("Too many steps");
            }
            //calculate the number of miles 
            numMiles = (double)numSteps / 2000;
            System.out.print("Number of miles: " + numMiles);

        } //end of try 
       
        catch(InputMismatchException ie) {  //must come before the exception catch becase that one captures everything 
            System.out.println("Invalid input");
            sc.next();
        }

        catch(Exception e){ //captures every eceptions thrown
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }


       

    }
}
