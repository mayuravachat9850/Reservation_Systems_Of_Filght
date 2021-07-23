package com.company;

import java.time.LocalDateTime;

public abstract class Ticket {
    String pnr;
    String from;
    String  to;
    Flight flight;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;
    Passenger passenger;


    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.passenger = passenger;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = true;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getFlightDuration(){
        LocalDateTime departureDateTime = LocalDateTime.parse(this.departureDateTime);
        LocalDateTime arrivalDateTime = LocalDateTime.parse(this.arrivalDateTime);
        int days = arrivalDateTime.getDayOfMonth() - departureDateTime.getDayOfMonth();
        int totalHours = (days*24) + (arrivalDateTime.getHour() - departureDateTime.getHour());
        return totalHours;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "pnr='" + pnr + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", departureTimeStamp='" + departureDateTime + '\'' +
                ", arrivalTimeStamp='" + arrivalDateTime + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", price=" + price +
                ", cancelled=" + cancelled +
                '}';
    }
}
