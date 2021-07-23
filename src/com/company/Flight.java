package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedseats;

    public Flight(String flightNumber, String airline, int capacity, int bookedseats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedseats = bookedseats;
    }
    public void incrementBookingCounter(){
        this.bookedseats++;
    }

    public boolean checkAvalibility(){
        if(this.bookedseats < capacity)
            return true;
        else
            return false;
    }
}
