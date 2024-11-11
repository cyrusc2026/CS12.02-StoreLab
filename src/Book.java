public class Book extends ReadingItem{
    private String isbn;
    private String edition;
    private String title;

    public Book(String name, String location, int price, String description, int wordCount, String datePublished, String author, String isbn, String edition, String title) {
        super(name, location, price, description, wordCount, datePublished, author);
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String showInfo(){
        return ("Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nDescription: " + getDescription() +
                "\nLocation: " + getLocation() +
                "\nAuthor: " + getAuthor() +
                "\nWord Count: " + getWordCount() +
                "\nDate Published: " + getDatePublished() +
                "\nTitle: " + getTitle() +
                "\nISBN: " + getIsbn() +
                "\nEdition: " + getEdition());
    }
}
