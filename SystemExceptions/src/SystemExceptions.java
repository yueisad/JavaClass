import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class SystemExceptions {
    public static void main(String[] args) {
        //variables 
        int num;  //numerator
        int dem; //denominator
        double result; //calculated value

        try {
            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);

            //loop until end of file
            while(sc.hasNext()) {
                num = sc.nextInt();
                dem = sc.nextInt();
                result = num/dem;
                System.out.println(num + " / " + dem + " = " + result);
            }
            sc.close();
        }
        catch(FileNotFoundException fe) {
            System.out.println("File not found");
        }
        catch(InputMismatchException ie) {
            System.out.println("Input mismatch: " + ie.toString());
        }
        catch(ArithmeticException ae) {
            System.out.println("Arithmetic error: " + ae.getMessage());
        }
        catch(NoSuchElementException ee) {
            System.out.println("No such element: " + ee.getMessage());
        }
        finally {
            System.out.println("done");
        }

    }
}
