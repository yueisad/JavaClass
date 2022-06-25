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
         monthInt = 00;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      Scanner inSS = null;
      String userString = "";
      String month = "";
      String dateString = "";
      String year = "";

      userString = scnr.nextLine();
      while (!userString.equals("-1")) {
         inSS = new Scanner(userString);
         month = inSS.next();
         
         if (inSS.hasNext()) {
            dateString = inSS.next();
            if (dateString.charAt(dateString.length()-1) == ',') {
               dateString = dateString.substring(0, dateString.length() - 1);
               year = inSS.next();
               System.out.println(getMonthAsInt(month) + "/" + dateString + "/" + year);
            }
         }
         
         userString = scnr.nextLine();
      }
   }   
}