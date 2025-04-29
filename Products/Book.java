package Products;

public class Book extends Product {
    private String author;
    private String publisher;
    private String genre;
    private static int numberOfBooks = 0;

    public Book(String title, Double price , String author, String publisher, String genre) {
        super(title, price);
        setAuthor(author);
        setPublisher(publisher);
        setGenre(genre);
        this.setId(generateId());

    }

    public void setAuthor(String author) {
        if(author.isEmpty())
            throw new IllegalArgumentException("Author cannot be empty");
        this.author = author;
    }

    public void setPublisher(String publisher) {
        if(publisher.isEmpty())
            throw new IllegalArgumentException("Publisher cannot be empty");
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        if(genre.isEmpty())
            throw new IllegalArgumentException("Genre cannot be empty");
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String generateId(){
        return String.valueOf("100" + ++numberOfBooks);
    }

    @Override
    public String toString() {
        return "Book  " + super.toString() + "  " + author + "  " + publisher + "  " + genre;
    }
}
