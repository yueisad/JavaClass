//parent class for all rectangle objects - things important to the rectangle class 
public /* abstract - allows for this class to only be referenced */ class Rectangle {
    
    //variables 
    protected double length, width;     //protected variables gives access to other classes that stems from this class 

    //constructor

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //mutator methods
    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    //accessor methods

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //getArea

    public double getArea() {
        return length * width; 
    }

    //print info
    public void printInfo() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }

}
