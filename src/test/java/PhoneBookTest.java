import org.junit.jupiter.api.*;
import ru.netology.PhoneBook;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    public void beforeEachTest() {
        phoneBook = new PhoneBook();
        phoneBook.add("Dima", "+78167122366");
    }

    @AfterEach
    public void afterEachTest() {
        phoneBook = null;
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(1, phoneBook.getPhoneBookSize());
        Assertions.assertFalse(phoneBook.phoneBookIsEmpty());
    }

    @Test
    public void testFindByNumber() {
        String name = phoneBook.findByNumber("+78167122366");
        Assertions.assertEquals("Dima", name);

        name = phoneBook.findByNumber("11111111");
        Assertions.assertNull(name);
    }

    @Test
    public void testFindByName() {
        String phoneNumber = phoneBook.findByName("Dima");
        Assertions.assertEquals("+78167122366", phoneNumber);

        phoneNumber = phoneBook.findByName("llllllll");
        Assertions.assertNull(phoneNumber);
    }

    @Test
    public void testPrintAllName(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        phoneBook.printAllNames();

        String expectedOutput = "Dima";
        Assertions.assertEquals(expectedOutput, outContent.toString());
    }
}