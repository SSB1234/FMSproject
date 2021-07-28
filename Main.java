package sky.com.company;

public class Main {

    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Mantavya","3534665688",
                "mantavya@email.com","Maneela Street","Gurgaon","Haryana");
        Flight flight1 = new Flight("7894","indigo",388);
        RegularTicket ticket1 = new RegularTicket("2343535","Delhi","Mumbai",flight1,"2:00 PM"
        ,"4:00PM",passenger1,"35f",5670.00f,"food and water");
        Passenger passenger2 = new Passenger("yashraj","2352524256", "yashraj@email.com",
                "mp nagar","Bhopal","Madhya Pradesh");
        Flight flight2 = new Flight("8978","British Airways",580);
        TouristTicket ticket2 = new TouristTicket("43536666","London","Paris",flight2,"7:00 PM"
        ,"10:00PM",passenger2,"68",25000.00f,"Mounttown street,hotel Le Walt Paris",
                "Eiffel Tower");
        System.out.println(passenger1.getAddressDetail());
        System.out.println(passenger1.getContactDetails());
        System.out.println(flight1.getFlightDetails());
        System.out.println(ticket1.getSpecialServices());
        System.out.println(passenger2.getAddressDetail());
        System.out.println(passenger2.getContactDetails());
        System.out.println(flight2.getFlightDetails());
        System.out.println(ticket1.checkStatus());
        System.out.println(ticket2.checkStatus());
    }
}
