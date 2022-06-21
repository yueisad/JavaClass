public class ItemToPurchase {

    //private fields
    private String itemName;
    private int itemPrice;
    private int itemQuantity; 

    //default constructor 
    public ItemToPurchase(){
        this.itemName = "none";
        this.itemPrice = 0; 
        this.itemQuantity = 0; 
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }
    public String getName() {
        return itemName;
    }


    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getPrice(){
        return itemPrice;
    }


    public void setQuantity(int itemQuantity){
        this.itemQuantity = itemQuantity;
    }
    public int getQuantity() {
        return itemQuantity;
    }
    
    public int totalPrice(int itemPrice, int itemQuantity) {
        int totalPrice = itemPrice * itemQuantity;
        return totalPrice; 

    }

    
}
