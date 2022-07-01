import java.io.File;
import java.util.Scanner;

//TO DO
// set the user input into its class variables
// display the instrument type, manufacturer, year built, cost, number of strings,
// and number of frets each on a separate line

public class InstrumentInformation {
	
   public static void main(String[] args) {
	File text = new File("/Users/aldenpark/Github/JavaClass/InstrumentThing/Instruments.txt");


      getInstrumentInfo();

   } //end main
   
   public static void getInstrumentInfo() {
	   
	   //variables
	   String instrumentType, manufacturerName, stringInstrumentName, stringManufacturer;
	      int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;
	   

	   Scanner scnr = new Scanner(text);
	   
	   
	   System.out.print("Enter String Instrument Type: ");
	   stringInstrumentName = scnr.nextLine();
	   System.out.println("Enter Manufacturer Name: ");
	   stringManufacturer = scnr.nextLine();
	   System.out.println("Enter Year Built: ");
	   stringYearBuilt = scnr.nextInt();
	   System.out.println("Enter cost: $");
	   stringCost = scnr.nextInt();
	   System.out.println("Enter the number of strings: ");
	   numStrings = scnr.nextInt();
	   System.out.println("Enter the number of frets: ");
	   numFrets = scnr.nextInt();
	   
	   StringInstrument myStringInstrument = new StringInstrument(stringInstrumentName, stringManufacturer, stringYearBuilt, stringCost, numStrings, numFrets);


	   myStringInstrument.printInfo();
	   
   } //end getInstrumentInfo
}