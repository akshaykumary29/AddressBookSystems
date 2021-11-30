package Com.bridgelabz.addressbooksystem;

import Com.bridgelabz.addressbooksystem.addressbooksystem.ContactPerson;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    List<ContactPerson> contact = new ArrayList<ContactPerson>();

    @Test
    public void WhenGivenContactDetails_addToBook_WhenAddedShouldReturnTrue() {

        ContactPerson c = new ContactPerson("Akshay", "Yamgar", "Mumbai",
                "Mumbai", "Maharashtra", "akshay@gmail.com", 400043, "9876543210");
        boolean output = contact.add(c);

        Assert.assertTrue(output);
    }
}
