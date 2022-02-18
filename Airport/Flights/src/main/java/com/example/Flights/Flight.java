package com.example.Flights;
public class Flight {
    private final int id;
    private final int flightname;
    private final String name;

    public Flight(final int id, final int flightname, final String name) {
        this.id = id;
        this.flightname = flightname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getFlightname() {
        return flightname;
    }

    public String getName() {
        return name;
    }
}