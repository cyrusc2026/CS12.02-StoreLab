public class Arudino extends ElectronicItem{
    private String version;
    public Arudino(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String showInfo() {
        return ("Name: " + getName() +
                "\nPrice: " + getPrice() +
                "\nDescription: " + getDescription() +
                "\nLocation: " + getLocation() +
                "\nStorage Capacity: " + getStorageCapacity() +
                "\nModel: " + getModel() +
                "\nMaker: " + getMaker() +
                "\nOperating System: " + getOperatingSystem() +
                "\nVersion: " + getVersion());
    }
}
