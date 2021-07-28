package sky.com.company;

public class Passenger {
    static int idCounter;
    private int id;
    public static class Address {
        String street;
        String city;
        String state;

        public Address(String addressStreet, String addressCity, String state) {
            this.street = addressStreet;
            this.city = addressCity;
            this.state = state;
        }
    }
    Address address;
    public static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    Contact contact;
    static{
     idCounter++;
    }
    public Passenger( String contactName, String contactPhone,
                           String contactEmail,String addressStreet, String addressCity,
                      String addressState){
             this.id = idCounter;
             this.address = new Address(addressStreet,addressCity,addressState);
             this.contact = new Contact(contactName,contactPhone,contactEmail);
    }

    public String getContactDetails(){
        return contact.name+" "+contact.email+" "+contact.phone;
    }
    public void updateContactDetails(String contactName, String contactPhone, String contactEmail){
        contact.name = contactName;
        contact.email = contactEmail;
        contact.phone = contactPhone;
    }
    public String getAddressDetail(){
        return address.street+" "+address.city+" "+address.state;
    }
    public void updateAddressDetails(String addressStreet, String addressCity, String addressState){
        address.street = addressStreet;
        address.city = addressCity;
        address.state = addressState;
    }
}
