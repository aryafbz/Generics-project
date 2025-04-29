package Products;

public class NoteBook extends Product {
    private int pageCount;
    private Boolean isHardCover;
    private static int numberOfNoteBooks = 0;

    public NoteBook(String title, Double price, int pageCount, Boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setIsHardCover(isHardCover);
        this.setId(generateId());

    }

    public void setPageCount(int pageCount) {
        if(pageCount < 0)
            throw new IllegalArgumentException("Page count cannot be negative");
        this.pageCount = pageCount;
    }

    public void setIsHardCover(Boolean isHardCover) {
        if(isHardCover == null)
            throw new IllegalArgumentException("Hard cover cannot be null");
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Boolean getIsHardCover() {
        return isHardCover;
    }

    @Override
    public String generateId(){
        return String.valueOf("200" + ++numberOfNoteBooks);
    }

    @Override
    public String toString() {
        return "NoteBook  " + super.toString() + "  " + pageCount + "  " + isHardCover;
    }
}
