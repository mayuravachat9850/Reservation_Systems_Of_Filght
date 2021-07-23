package com.company;

public class Tourist_Ticket extends  Ticket{
    private String hotelAdress;
    private String[] selectedTouristLoccation;

    public Tourist_Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Passenger passenger, String hotelAdress, String[] selectedTouristLoccation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, seatNo, price, cancelled, passenger);
        this.hotelAdress = hotelAdress;
        this.selectedTouristLoccation = selectedTouristLoccation;
    }

    public String getHotelAdress() {
        return hotelAdress;
    }

    public void setHotelAdress(String hotelAdress) {
        this.hotelAdress = hotelAdress;
    }

    public String[] getSelectedTouristLoccation() {
        return selectedTouristLoccation;
    }

    public void setSelectedTouristLoccation(String[] selectedTouristLoccation) {
        this.selectedTouristLoccation = selectedTouristLoccation;
    }
}
