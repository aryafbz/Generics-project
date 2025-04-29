import Inventory.Inventory;
import Products.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<Book>();
        Inventory<NoteBook> noteBookInventory = new Inventory<NoteBook>();
        Inventory<Accessory> accessoryInventory = new Inventory<Accessory>();

        Book book1 = new Book("12 Rules For Life" , 54700.00 , "Jordan Peterson" , "Penguin" , "Psychology");
        Book book2 = new Book("The Street Lawyer" , 50000.00 , "John Grisham" , "Penguin" , "Short story");

        NoteBook noteBook1 = new NoteBook("Math NoteBook" , 30000.00 , 200 , true);
        NoteBook noteBook2 = new NoteBook("Physics NoteBook" , 35600.00 , 100 , false);

        Accessory accessory1 = new Accessory("Watch" , 70000.00 , "black");
        Accessory accessory2 = new Accessory("Necklace" , 80000.00 , "gold");

        bookInventory.addItem(book1);
        bookInventory.addItem(book2);

        noteBookInventory.addItem(noteBook1);
        noteBookInventory.addItem(noteBook2);

        accessoryInventory.addItem(accessory1);
        accessoryInventory.addItem(accessory2);

        bookInventory.display();
        noteBookInventory.display();
        accessoryInventory.display();

        bookInventory.removeItemById(1002);
        noteBookInventory.removeItemById(2001);
        System.out.println();

        System.out.println(calculateTotalPrice(bookInventory));
        System.out.println(calculateTotalPrice(noteBookInventory));
        System.out.println(calculateTotalPrice(accessoryInventory));
        System.out.println();

        System.out.println(accessoryInventory.findItemById(3002));
        System.out.println(accessoryInventory.findItemById(3004));
        System.out.println();

        bookInventory.applyDiscount("12 Rules For Life" , 20);
        noteBookInventory.applyDiscount("Physics NoteBook" , 30);


        bookInventory.display();
        noteBookInventory.display();
        accessoryInventory.display();
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double totalPrice = 0;
        ArrayList<? extends Product> products = inventory.getItems();
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}