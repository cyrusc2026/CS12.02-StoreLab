public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    public Phone(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getNetworkType() {
        return networkType;
    }

    public int getScreenSize() {
        return screenSize;
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
                "\nNetwork Type: " + getNetworkType() +
                "\nScreen Size: " + getScreenSize());
    }
}
