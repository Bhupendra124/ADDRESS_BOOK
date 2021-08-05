import java.util.HashMap;
import java.util.Objects;

public class Contact {


    //private HashMap<String, String> customField;
    String firstName;
        String lastName;
        String address;
        String city;
        String State;
        String Zip;
        String phoneNumber;
        String email;
        String toString;



    public  Contact(){
        firstName=lastName=address=city=State=Zip=phoneNumber=email=toString=null;
        this.customField=new HashMap<String,String>();
    }
    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        State = state;
        Zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customField=new HashMap<String,String>();
    }


    /**
     * Getter  Allows the AddressBook
     developer to get the value of contact detail.
     @return the detail contact as a string

     * Setter . Allows the AddressBook
     * developer to set the value of contact.
     detail  as a string to set to
    */
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public HashMap<String, String> getCustomField() {
      //  if (customField==null)
        //    customField=new HashMap<String,String>();
        return customField;
    }
    public void setCustomField(String fieldName, String firstValue){
     //   if (customField==null)
      //     customField=new HashMap<String,String>();
        customField.put(fieldName,firstValue);
    }

    @Override
    public String toString() {
         toString=
                "customField=" + customField +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Zip='" + Zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email ;
        if (customField.size()== 0)
            return toString ;
        else {
            for (String key : customField.keySet())

            toString = toString + "\n" + key + ": " + customField.get(key);

            return toString;

        }
    }
    private HashMap<String, String> customField;


}
