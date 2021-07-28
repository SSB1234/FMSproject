package sky.com.company;

public class Flight {
    private int bookingCounter=0;
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber,String airline,int capacity){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookingCounter;
        incrementBookingCounter();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails(){
        return "Flight Number: "+getFlightNumber()+", Airline: "+getAirline()+", Capacity: "+getCapacity()+
                ", Number of Booked Seats: "+bookedSeats;
    }
    public boolean checkAvailability(){
        if(bookedSeats<capacity){ return true ;}
        else
            return false;
    }
    public void incrementBookingCounter(){
                 bookingCounter++;
    }
}
