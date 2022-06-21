import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ItemToPurchase itemInfo1 = new ItemToPurchase();
        ItemToPurchase itemInfo2 = new ItemToPurchase();

        System.out.println("Enter item name:");
        itemInfo1.setName(scnr.next());
        System.out.println("Enter item price:");
        itemInfo1.setPrice(scnr.nextInt());
        int itemPrice1 = itemInfo1.getPrice();
        System.out.println("Enter item quantity:");
        itemInfo1.setQuantity(scnr.nextInt()); 
        int itemQuantity1 = itemInfo1.getQuantity();

        scnr.nextLine();

        System.out.println("Enter item name:");
        itemInfo2.setName(scnr.next());
        System.out.println("Enter item price:");
        itemInfo2.setPrice(scnr.nextInt());
        int itemPrice2 = itemInfo2.getPrice();
        System.out.println("Enter item quantity:");
        itemInfo2.setQuantity(scnr.nextInt());
        int itemQuantity2 = itemInfo2.getQuantity();

        System.out.println(itemInfo1.getName() + " " + itemInfo1.totalPrice(itemPrice1, itemQuantity1));
        System.out.println(itemInfo2.getName() + " " + itemInfo2.totalPrice(itemPrice2, itemQuantity2));

        //System.out.println(itemInfo1.getName() + " " + itemInfo1.getQuantity() + " @ $" + itemInfo1.getPrice() + " = $" + (itemInfo1.getPrice() * itemInfo1.getQuantity()));
        //System.out.println(itemInfo2.getName() + " " + itemInfo2.getQuantity() + " @ $" + itemInfo2.getPrice() + " = $" + (itemInfo2.getPrice() * itemInfo2.getQuantity()));

        System.out.println();

        System.out.println("The total price is " + itemInfo1.totalPrice(itemPrice1, itemQuantity1) + itemInfo2.totalPrice(itemPrice2, itemQuantity2));
    }

}
