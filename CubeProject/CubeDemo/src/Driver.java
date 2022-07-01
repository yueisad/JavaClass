//main
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        //variables

        double len;
        double wid;
        double hei;

        //create scanner object
        Scanner scnr = new Scanner(System.in);
        //prompt user for the input

        System.out.println("Enter a length: ");
        len = scnr.nextDouble();

        System.out.println("Enter a width: ");
        wid = scnr.nextDouble();

        System.out.println("Enter a height: ");
        hei = scnr.nextDouble();

        //create Cube object
        Cube c  = new Cube(len, wid, hei);
        
        //Rectangle r = new Cube(len, wid, hei);
        
        //r.printInfo();

        //display the properties
        System.out.println("Length: " + c.getLength());
        System.out.println("Width: " + c.getWidth());
        c.printInfo();

        //close scnr
        scnr.close();
    }


    
}
