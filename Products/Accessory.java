package Products;

public class Accessory extends Product {
    private String color;
    private static int numberOfAccessories = 0;

    public Accessory(String title , Double price, String color) {
        super(title, price);
        setColor(color);
        this.setId(generateId());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String generateId(){
        return String.valueOf("300" + ++numberOfAccessories);
    }

    @Override
    public String toString() {
        return "Accessory  " + super.toString() + "  " + color;
    }

}
