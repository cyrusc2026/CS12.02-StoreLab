public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;
    public CISItem(String name, String location, int price, String description){
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
        //constructor for each CISItem
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
    //getters

    public String showInfo() {
        return ("Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nDescription: " + getDescription() +
                "\nLocation: " + getLocation());
    }
}
