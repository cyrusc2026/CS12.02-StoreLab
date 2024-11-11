public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;
    public ReadingItem(String name, String location, int price, String description, int wordCount, String datePublished, String author) {
        super(name, location, price, description);
        // inherits from superclass CIS Item
        this.wordCount = wordCount;
        this.author = author;
        this.datePublished = datePublished;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String showInfo(){
            return ("Name: " + getName() +
                    "\nPrice: " + getPrice() +
                    "\nDescription: " + getDescription() +
                    "\nLocation: " + getLocation() +
                    "\nAuthor: " + getAuthor() +
                    "\nWord Count: " + getWordCount() +
                    "\nDate Published: " + getDatePublished());
    }
}

