//sub class
public class Cube extends Rectangle {       //extends from the rectangle class
    
    //variables 
    private double height;

    //constructor
    public Cube(double l, double w, double h) {
        super(l, w); //calls the super class (rectangle) and defines the length and width
        //super needs to be called first
        //this is the same as setting length = l; and width = w
        height = h; 
    }

    //mutator methods
    public void setHeight(double h) {
        height = h;
    }

    //accessor methods
    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        return getArea() * 6;
    }

    public double getVolume() {
        return getArea() * height;
    }
    // if you add override, it will use this over the parent class method
    public void printInfo() {
        super.printInfo();
        System.out.println("Surface Area = " + surfaceArea());
        System.out.println("Volume = " + getVolume());
    }


}
