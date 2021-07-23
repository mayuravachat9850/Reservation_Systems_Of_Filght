package com.company;

public class Filght_Main {

    public static void main(String[] args){
        Passenger passenger = new Passenger("Mg Road", "Pune","Maharastra",
                "Mayur", "9850449559", "avachatmayur7@gmail.com");
        Flight flight = new Flight("133NR","AirIndia", 250, 1);

        Regular_Ticket  regularTicket = new Regular_Ticket("13PNR786", "PUN", "MUM",
                flight, "23/07/2021", "23/07/2021",
                "30A", 5500, false, passenger, "massage");

        String hotelAddress = "Taj Palce, Mumbai";
        String[] locations = {"Marin Line","Mumbai"};

        Tourist_Ticket touristTicket = new Tourist_Ticket("89PNR586", "PUN", "MUM",
                flight, "23/07/2021", "23/07/2021",
                "30A", 5500, false, passenger, hotelAddress, locations);

        printDetails(regularTicket);
        printDetails(touristTicket);

    }
    public static void printDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
