package Inventory;

import Products.*;

import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName , int discount) {
        for (T item : items) {
            if(item.getTitle().equalsIgnoreCase(productName)) {
                item.setPrice(item.getPrice() * (100 - discount) / 100);
                return;
            }
        }
        throw new IllegalArgumentException("No such product");
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItemById(int id) {
        for (T item : items) {
            if(Integer.parseInt(item.getId()) == id) {
                items.remove(item);
                return;
            }
        }
        throw new IllegalArgumentException("No such product");
    }

    public Product findItemById(int id) {
        for (T item : items) {
            if(Integer.parseInt(item.getId()) == id) {
                return item;
            }
        }
        System.out.println("Item not found");
        return null;
    }

    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
