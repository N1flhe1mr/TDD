import org.junit.jupiter.api.*;
import ru.netology.PhoneBook;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Dima","+79307040723" );
        Assertions.assertEquals(1, phoneBook.getPhoneBookSize());
        Assertions.assertFalse(phoneBook.phoneBookIsEmpty());
    }
}