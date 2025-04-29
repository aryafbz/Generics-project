package Products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
    }

    public void setTitle(String title) {
        if(title.isEmpty())
            throw new IllegalArgumentException("Title cannot be empty");
        this.title = title;
    }

    public void setPrice(Double price) {
        if(price <= 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public void setId(String id) {
        if(id.isEmpty())
            throw new IllegalArgumentException("ID cannot empty");
        if(id.trim().length() < 4)
            throw new IllegalArgumentException("ID cannot be less than 4 characters");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + "  " + title + "  " + price;
    }

    protected abstract String generateId();
}
