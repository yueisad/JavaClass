import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      
      FileInputStream fileStream;
      Scanner fileScanner = null;
      Scanner inSS = null;
      
   
      String userString = "";
      String date = ""; 		
      String month = "";
      String year = "";
		
		//open the input file 
		
      fileStream = new FileInputStream("/Users/aldenpark/Github/JavaClass/DateParser/DateParser/lib/WordDate.txt");
		
      fileScanner = new Scanner(fileStream);
		
		//for file output
		
      PrintWriter outputFile = new PrintWriter("/Users/aldenpark/Github/JavaClass/DateParser/DateParser/lib/NumberDates.txt");
		
		//for each line in the input file, read in the filename and output the modified filename into the output file
		
	
      while (fileScanner.hasNext()) {
    	  userString = fileScanner.nextLine();
          System.out.println(userString);
          inSS = new Scanner(userString);
          
          month = inSS.next();
    	  //System.out.println(month);
          
          if (inSS.hasNext()) {
        	  date = inSS.next();
        	  
        	  if (date.charAt(date.length() - 1) == ',') { 		//if at the year, there is a comma
        		  date = date.substring(0, date.length() -1);
        		  year = inSS.next();
        		  System.out.println(getMonthAsInt(month) + "/" + date + "/" + year);
        		 
        	  }
          }
          //write to output file
          outputFile.println(getMonthAsInt(month) + "/" + date + "/" + year);
          
		} //end while loop 
		
		//close 
		fileScanner.close();
		outputFile.close();
		fileStream.close();
		
		System.out.print("DONE");

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
     
   }
}
