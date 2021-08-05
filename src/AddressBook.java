import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner=new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBook)) return false;
        AddressBook that = (AddressBook) o;
        return getZip() == that.getZip() && getPhoneNumber() == that.getPhoneNumber() && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getState(), that.getState()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getCity(), getState(), getZip(), getPhoneNumber(), getEmail());
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AddressBook addressBkObj = new AddressBook();
        System.out.println("Enter the details in addressbook :: ");
        addressBkObj.inputAddressBk();
    }

    public ArrayList<String> inputAddressBk() {

        AddressBook addressBook = new AddressBook();
        ArrayList<String> listPerson1 = new ArrayList<String>();
        System.out.println("Welcome to Address Book Program");

        System.out.println("Enter your first name :: ");                                //person 1
        String firstname = addressBook.scanner.nextLine();
        addressBook.setFirstName(firstname);
        listPerson1.add(addressBook.getFirstName());

        System.out.println("Enter your last name :: ");
        String lastname = addressBook.scanner.nextLine();
        addressBook.setLastName(lastname);
        listPerson1.add(addressBook.getLastName());

        System.out.println("Enter your email :: ");
        String email = addressBook.scanner.nextLine();
        addressBook.setEmail(email);
        listPerson1.add(addressBook.getEmail());

        System.out.println("Enter your City :: ");
        String city = addressBook.scanner.nextLine();
        addressBook.setCity(city);
        listPerson1.add(addressBook.getCity());

        System.out.println("Enter your state :: ");
        String state = addressBook.scanner.nextLine();
        addressBook.setState(state);
        listPerson1.add(addressBook.getState());

        System.out.println("Enter your zip :: ");
        int zip = addressBook.scanner.nextInt();
        addressBook.setZip(zip);
        listPerson1.add(Integer.toString(addressBook.getZip()));

        System.out.println("Enter your Phone Number:: ");
        long phoneNumber = addressBook.scanner.nextLong();
        addressBook.setPhoneNumber(phoneNumber);
        listPerson1.add(Long.toString(addressBook.getPhoneNumber()));


        System.out.println("First Name   :: " + listPerson1.get(0) + " | " + "Last Name :: " + listPerson1.get(1));
        System.out.println("Email        :: " + listPerson1.get(2) + " | " + "City      :: " + listPerson1.get(3));
        System.out.println("State        :: " + listPerson1.get(4) + " | " + "Zip       :: " + listPerson1.get(5));
        System.out.println("Phone Number :: " + listPerson1.get(6));


        System.out.println('\n' + "Enter " + '\n' + "1 to edit the contact " + '\n' + " 2 to remove contact" + '\n' + " 3 to exit");
        int choice = addressBook.scanner.nextInt();

        switch (choice) {
            case 1:
                addressBook.updateAddressBk(listPerson1);
                break;
            case 2:
                boolean key = true;
                while (key) {
                    System.out.println("Please Enter the first name to delete the contact ");
                    String nameChecker = scanner.nextLine();
                    if (listPerson1.get(0).equalsIgnoreCase(nameChecker)) {
                        addressBook.removeContact(listPerson1);
                        System.out.println("Contact deleted");
                        key = false;
                    } else
                        System.out.println(" Name mismatch! , Enter correct name ");
                }
                break;

            case 3:
                System.exit(0);
                break;
        }
        return (listPerson1);
    }

    public void updateAddressBk(ArrayList<String> listPerson1) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to editor section ::");
        System.out.println("Enter choice for change :: 1 - firstname : 2 - lastname : 3 - email : 4 - city : 5 - state : 6 - zip : 7 - phone number ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your first name :: ");
                listPerson1.set(0, addressBook.scanner.nextLine());
                break;
            case 2:
                System.out.println("Enter your last name :: ");
                listPerson1.set(1, addressBook.scanner.nextLine());
                break;
            case 3:
                System.out.println("Enter your email:: ");
                listPerson1.set(2, addressBook.scanner.nextLine());
                break;
            case 4:
                System.out.println("Enter your city:: ");
                listPerson1.set(3, addressBook.scanner.nextLine());
                break;
            case 5:
                System.out.println("Enter your state:: ");
                listPerson1.set(4, addressBook.scanner.nextLine());
                break;
            case 6:
                System.out.println("Enter your Zip:: ");
                listPerson1.set(5, Integer.toString(addressBook.scanner.nextInt()));
                break;
            case 7:
                System.out.println("Enter your Phone Number:: ");
                listPerson1.set(6, Long.toString(addressBook.scanner.nextLong()));
                break;
        }

        System.out.println("First Name   :: " + listPerson1.get(0) + " | " + "Last Name :: " + listPerson1.get(1));
        System.out.println("Email        :: " + listPerson1.get(2) + " | " + "City      :: " + listPerson1.get(3));
        System.out.println("State        :: " + listPerson1.get(4) + " | " + "Zip       :: " + listPerson1.get(5));
        System.out.println("Phone Number :: " + listPerson1.get(6));
    }

    public void removeContact(ArrayList<String> listPerson1) {
        listPerson1.clear();
    }
}



