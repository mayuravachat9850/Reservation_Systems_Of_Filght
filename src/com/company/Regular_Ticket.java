package com.company;

public class Regular_Ticket extends Ticket{
    private String specialServices;

    public Regular_Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Passenger passenger, String specialServices) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, seatNo, price, cancelled, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
