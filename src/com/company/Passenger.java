package com.company;

public class Passenger {
    private static int idCounter = 0;
    private int id;

    private Address address;
    private Contact contact;

    private static class Address{
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact{
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public Passenger(String street,String city,String state,String name,String phone,String email) {
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getPassengerCount(){
        return  idCounter;
    }

    public String getContactDetails(){
        return  "Name :" + contact.name + ", Phone :" + contact.phone + ", Email : " + contact.email;
    }

    public String getAddressDetails(){
        return  "Street :" + address.street + ", City :" + address.city + ", State : " + address.state;
    }

    @Override
    public String toString() {
        String details = "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
        return details;
    }
}
