//package zExceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Type {
   public static double stepsToMiles(int userSteps) throws Exception {
      return userSteps / 2000.0;
   }
   
   public static void main(String[] args)  {
      Scanner scnr = new Scanner(System.in);
      int inputSteps = 0;
	  Boolean input = true;
      
      while (input) {
    	  System.out.print("Enter the number of steps: ");
    	  try {
    		  inputSteps = scnr.nextInt();
    		  if (inputSteps < 0) {
    			  throw new Exception("Exception: Negative step count entered.");
			  }
			  else if (inputSteps == 0) {
				input = false;
			  }
			  
    		  System.out.printf("%.2f\n", stepsToMiles(inputSteps));
			  
    	  }
    	  catch (InputMismatchException e) {
    		  System.out.println(e.toString());
    		  System.out.println("You must enter an integer value");
    		  System.out.println("Try again: ");
			  scnr.next();

    	  }
    	  catch (Exception e) {
    		  System.out.println(e.getMessage());
			  
    	  }
      } //end loop
     		
   }
}
