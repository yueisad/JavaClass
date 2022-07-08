import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordValidator {
    public static void main (String[] args) {

        //variables
        String pass; 
        Scanner sc = new Scanner(System.in);
        Boolean input = true;
        while (input) {
            try {
                System.out.println("Enter password: ");
                pass = sc.nextLine();
                if (pass.length() < 8) {
                    throw new Exception("Password too short");
                }
                else if (pass.length() > 15) {
                    throw new Exception("Password too long");
                }
                else {
                    System.out.println("Good pass!");
                }
                
            }
            catch(InputMismatchException em) {
                System.out.println("bad password");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }

    }
}
