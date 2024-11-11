import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTester {
    Store store;
    Phone phoneOne;
    Phone phoneTwo;
    Phone phoneThree;
    Book bookOne;
    Book bookTwo;
    Book bookThree;

    @BeforeEach
    void setUp(){
        store = new Store();
        phoneOne = new Phone(
                "iPhone XS",
                "514",
                2000,
                "An outdated iPhone model - also known as an antique",
                64,
                "XS",
                "Apple",
                "iOS 12.0",
                "4G",
                6);
        phoneTwo = new Phone(
                "BlackBerry Z10",
                "Cafeteria",
                500,
                "An actual antique - what my parents refer to as a blast from the past",
                2,
                "Z10",
                "BlackBerry",
                "Blackberry 10.2.1",
                "4G",
                5);
        phoneThree = new Phone(
                "iPhone 18",
                "211",
                4000,
                "The newest iPhone model - a fancy find",
                256,
                "18",
                "Apple",
                "iOS 18.0",
                "5G",
                6);
        bookOne = new Book(
                "The World's Wife",
                "401",
                89,
                "A collection of poems highlighting the female voice",
                24000,
                "2017",
                "Carol Ann Duffy",
                "978-1-509-85266-6",
                "1",
                "The World's Wife");
        bookTwo = new Book(
                "Fire and Fury: Inside the Trump White House",
                "713",
                92,
                "Exemplifying descriptions of Trump's behavior, chaotic interactions among senior White House staff during his first presidential term",
                84000,
                "2018",
                "Michael Wolff",
                "978-1-250-15806-2",
                "1",
                "Fire and Fury: Inside the Trump White House");
        bookThree = new Book(
                "The 5AM Club",
                "Carpark",
                128,
                "A book explaining the revolutionary morning routine",
                105000,
                "2018",
                "Robin Sharma",
                "978-1-443-45662-3",
                "1",
                "The 5AM Club: Own Your Morning. Elevate Your Life");

    }
    @AfterEach
    void tearDown (){
        store = null;
    }
    @Test
    public void addBookTest(){
        store.addBook(bookOne);
        assertTrue(store.getItems("Book").size()==1);
    }

    @Test
    public void addBookAndAddPhoneTest(){
        store.addBook(bookTwo);
        store.addPhone(phoneOne);
        assertTrue(store.getItems("Book").size()==1&&store.getItems("Phone").size()==1);
    }

    @Test
    public void updatePhonesLocationAndGetAllPhonesTest(){
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.addPhone(phoneThree);
        store.updatePhonesLocation("Room 512");
        for (int i = 0; i < 3; i++){
            assertEquals("Room 512",store.getCisItems().get(i).getLocation());
        }
    }

    @Test
    public void getItemsTest(){
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.addBook(bookTwo);
        store.addBook(bookThree);
        assertEquals(2,store.getItems("Book").size());
        assertEquals(2,store.getItems("Phone").size());
    }

    @Test
    public void updateItemsTest(){
        store.addBook(bookOne);
        store.addBook(bookTwo);
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.updateItems("Book","edition","3");
        store.updateItems("Phone","model","3");
        for (int i = 0; i < 2; i++){
            assertEquals("3",((Phone)store.getItems("Phone").get(i)).getModel());
            assertEquals("3",((Book)store.getItems("Book").get(i)).getEdition());
        }
    }

}
