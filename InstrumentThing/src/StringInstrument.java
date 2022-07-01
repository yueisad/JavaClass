
public class StringInstrument extends Instrument {

    private int strings, frets;
    
    public StringInstrument(String userName, String userManufacturer, int userYearBuilt, int userCost, int userStrings, int userFrets) {
        super(userName, userManufacturer, userYearBuilt, userCost);
        strings = userStrings;
        frets = userFrets;
    }

    public void setString(int string) {
        strings = string;
    }
    public int getString() {
        return strings;
    }

    public void setFret(int fret) {
        frets = fret; 
    }
    public int getFret() {
        return frets;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Frets: " + getFret());
        System.out.println("   Strings: " + getString());
    }
}
