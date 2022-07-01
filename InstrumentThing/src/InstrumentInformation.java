import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TO DO
// set the user input into its class variables
// display the instrument type, manufacturer, year built, cost, number of strings,
// and number of frets each on a separate line

public class InstrumentInformation {
	
   public static void main(String[] args) throws FileNotFoundException {
      

      getInstrumentInfo();

   } //end main
   
   public static void getInstrumentInfo() throws FileNotFoundException {
	   
	   //variables
	   String instrumentType, manufacturerName, stringInstrumentName, stringManufacturer;
	      int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;
		 
		  FileInputStream fileStream;
	      Scanner fileScanner;

		  fileStream = new FileInputStream("Instruments.txt");
		  fileScanner = new Scanner(fileStream);
	   
	   while (fileScanner.hasNext()) {
	   //System.out.print("Enter String Instrument Type: ");
	   stringInstrumentName = fileScanner.next();
	   //System.out.println("Enter Manufacturer Name: ");
	   stringManufacturer = fileScanner.next();
	   //System.out.println("Enter Year Built: ");
	   stringYearBuilt = fileScanner.nextInt();
	  // System.out.println("Enter cost: $");
	   stringCost = fileScanner.nextInt();
	  // System.out.println("Enter the number of strings: ");
	   numStrings = fileScanner.nextInt();
	   //System.out.println("Enter the number of frets: ");
	   numFrets = fileScanner.nextInt();
	   StringInstrument myStringInstrument = new StringInstrument(stringInstrumentName, stringManufacturer, stringYearBuilt, stringCost, numStrings, numFrets);
	   myStringInstrument.printInfo();
	  
	   }
	   fileScanner.close();
   } //end getInstrumentInfo
}