import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        String firstWord = "";
        String SecondWord = "";
        int commaLocation = 0; 
        boolean input = false;


        while (!input) {
            //propmt user
            System.out.println("Enter input string:");
            userInput = scnr.nextLine();

            if (userInput.equals("q")) {
                input = true;
            } else {
            //Look for the comma character
                commaLocation = userInput.indexOf(',');
                if (commaLocation == -1){
                    System.out.println("Error: No comma in string.\n");
                } else {
                    firstWord = userInput.substring(0, commaLocation);
                    SecondWord = userInput.substring(commaLocation +1, userInput.length());
                    System.out.println("First word: " + firstWord.replace(" ", ""));
                    System.out.println("Second word: " + SecondWord.replace(" ", ""));
                    System.out.println("");
                }
        
            }

        }

        return;
        
        }
        
     }
  