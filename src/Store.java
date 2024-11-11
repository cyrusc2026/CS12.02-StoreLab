import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;

    public Store(){
        this.cisItems = new ArrayList<>();
    }
    public ArrayList<CISItem> getCisItems(){
        return cisItems;
    }
    public void addBook (Book book){
        cisItems.add(book);
    }

    public void addPhone (Phone phone){
        cisItems.add(phone);
    }

    public void updatePhonesLocation (String location){
        for (int i = 0; i < cisItems.size(); i++){
            // for loop checks all items in cisItems
            if (cisItems.get(i) instanceof Phone){
                // instanceof checks if the data type is phone
                cisItems.get(i).setLocation(location);
                // changes the location and changes the item in the cisItems ArrayList
            }
        }
    }

    public ArrayList<Phone> getAllPhones (){
        ArrayList<Phone> answer = new ArrayList<>();
        for (CISItem cisItem : cisItems) {
            if (cisItem instanceof Phone) {
                answer.add((Phone) cisItem);
                //picks out all the phones and adds it to the answer ArrayList
            }
        }
        return answer;
    }

    public ArrayList<CISItem> getItems (String dataType){
        ArrayList<CISItem> answer = new ArrayList<>();
        //each item is compatible with the CISItem object
        for (CISItem cisItem : cisItems) {
            if (cisItem.getClass().getSimpleName().equals(dataType)) {
                // checks if the name fo the class equal to the data type
                answer.add(cisItem);
                //picks out all the phones and adds it to the answer ArrayList
            }
        }
        return answer;
        // returns finished array
    }
    public void updateItems (String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            //loop through all items
            if (item.getClass().getSimpleName().equals(itemType)) {
                // checks the item type
                switch (property) {
                    // compares the chases to the String "property"
                    case "name":
                        // name of the class being switched
                        item.setName(value);
                        // sets new value
                        break;
                    // breaks to reduce runtime complexity
                    case "location":
                        item.setLocation(value);
                        break;
                    case "price":
                        item.setPrice(Integer.parseInt(value));
                        break;
                    case "description":
                        item.setDescription(value);
                        break;
                    case "wordCount":
                        ((ReadingItem) item).setWordCount(Integer.parseInt(value));
                        // need to cast String "value" to an int
                        //casting the item to the right class in order to use that classes' methods
                        break;
                    case "datePublished":
                        ((ReadingItem) item).setDatePublished(value);
                        break;
                    case "author":
                        ((ReadingItem) item).setAuthor(value);
                        break;
                    case "isbn":
                        ((Book) item).setIsbn(value);
                        break;
                    case "edition":
                        ((Book) item).setEdition(value);
                        break;
                    case "title":
                        ((Book) item).setTitle(value);
                        break;
                    case "coverStoryTitle":
                        ((Magazine) item).setCoverStoryTitle(value);
                        break;
                    case "printDate":
                        ((Magazine) item).setPrintDate(value);
                        break;
                    case "storageCapacity":
                        ((ElectronicItem) item).setStorageCapacity(Integer.parseInt(value));
                        break;
                    case "model":
                        ((ElectronicItem) item).setModel(value);
                        break;
                    case "maker":
                        ((ElectronicItem) item).setMaker(value);
                        break;
                    case "operatingSystem":
                        ((ElectronicItem) item).setOperatingSystem(value);
                        break;
                    case "networkType":
                        ((Phone) item).setNetworkType(value);
                        break;
                    case "screenSize":
                        ((Phone) item).setScreenSize(Integer.parseInt(value));
                        break;
                    case "version":
                        ((Arudino) item).setVersion(value);
                        break;
                }
            }
        }
    }
}
