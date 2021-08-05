import java.util.ArrayList;

public class AddressBook {
    Contact contact=new Contact();
  int currentContactIndex;
    public AddressBook() {
        currentContactIndex = Integer.parseInt(null);

    }


    ArrayList<Contact> contacts=new ArrayList<Contact>();
// Add a contact by passing in a constructed contact object filled with data


    public void addContact(Contact contact){
        contacts.add(contact);
     currentContactIndex=contacts.size()-1;
    }

    //temp printing contact
    public  void printItems(){
        for (Contact contact: contacts)
            System.out.println(contact);

    }
}
