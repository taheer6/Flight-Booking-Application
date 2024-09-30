/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author khant
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int currentnumber=1;
    private int number;
    
    public Ticket(Passenger p, Flight f, double pri){
        number=currentnumber;
        currentnumber++;
        passenger=p;
        flight=f;
        price=pri;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCurrentnumber() {
        return currentnumber;
    }

    public static void setCurrentnumber(int currentnumber) {
        Ticket.currentnumber = currentnumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s ,Flight %d, %s to %s, %s, Original Price: $%.2f, "
                + "Ticket Price: $%.2f",passenger.getName(),flight.getFlightNumber(),flight.getOrigin()
                ,flight.getDestination(),flight.getDepartureTime(),flight.getOriginalPrice(),price);
    }
    
    
}