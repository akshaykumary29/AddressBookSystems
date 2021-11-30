package Com.bridgelabz.addressbooksystem.addressbooksystem;

/**
 * The program implements of address book problem.
 *
 * @author : Akshay
 * @version : 1.8
 * @since : 30/11/2021
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);

    public static List<ContactPerson> contact = new ArrayList<ContactPerson>();

    public static void main(String[] args) throws AddressBookException {
        System.out.println("Welome To Address Book Program !!!");

        try {
            if (!addContact()) {
                throw new AddressBookException("enter correct data");
            }
        } catch (AddressBookException a) {
            System.out.println();
            a.printStackTrace();
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        showContacts(contact);
    }

    /*
     *Declaring The Add Contact Method
     *And Entering The Contact Details By Using Scanner Class
     *And Printing The Contact Details Of Person
     */
    public static boolean addContact() {

        ContactPerson contactPerson = new ContactPerson();

        System.out.println("enter first name");
        contactPerson.setFirstName(sc.next());
        System.out.println("enter last name");
        contactPerson.setLastName(sc.next());
        System.out.println("enter address");
        contactPerson.setAddress(sc.next());
        System.out.println("enter city");
        contactPerson.setCity(sc.next());
        System.out.println("enter state");
        contactPerson.setState(sc.next());
        System.out.println("enter zip");
        contactPerson.setZip(sc.nextInt());
        System.out.println("enter phone");
        contactPerson.setPhoneNumber(sc.next());
        System.out.println("enter email");
        contactPerson.setEmail(sc.next());

        boolean added = contact.add(contactPerson);
        return added;
    }

    public static void showContacts(List<ContactPerson> contact) throws AddressBookException {
        for (ContactPerson c : contact) {
            System.out.println(c);
        }
    }
}

