public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;
    public Magazine(String name, String location, int price, String description, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, location, price, description, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle) {
        this.coverStoryTitle = coverStoryTitle;
    }

    public void setPrintDate(String printDate) {
        this.printDate = printDate;
    }

    public String getCoverStoryTitle() {
        return coverStoryTitle;
    }

    public String getPrintDate() {
        return printDate;
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
                "\nCover Story Title: " + getCoverStoryTitle() +
                "\nPrint Date: " + getPrintDate());
    }
}
