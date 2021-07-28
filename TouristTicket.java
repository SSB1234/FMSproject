package sky.com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnr,String from, String to ,Flight flight,String departureDateTime,String arrivalDateTime,
                         Passenger passenger,String seatNo,float price,String hotelAddress,String selectedTouristLocation){
        super(pnr,from,to ,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
        addTouristLocations(selectedTouristLocation);
    }
    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return selectedTouristLocation;
    }
    public void removeTouristLocations(String location){
        for(int index=0;index<selectedTouristLocation.length;index++){
            if(location.equals(selectedTouristLocation[index])){
                selectedTouristLocation[index]=null;
            }
        }

    }
    public void addTouristLocations(String location){
        for(int index=0;index<selectedTouristLocation.length;index++){
            if(selectedTouristLocation[index]==null){
                selectedTouristLocation[index]=location;
            }
        }
    }
}
