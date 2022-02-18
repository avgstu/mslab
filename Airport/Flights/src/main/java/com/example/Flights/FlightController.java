package com.example.Flights;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;
@RequestMapping("/flights")
@RestController
public class FlightController {
    private final List<Flight> flights = Arrays.asList(
            new Flight(1, 1, "Flight A"),
            new Flight(2, 1, "Flight B"),
            new Flight(3, 2, "Flight C"),
            new Flight(4, 1, "Flight D"),
            new Flight(5, 2, "Flight E"));

    @GetMapping
    public List<Flight> getAllFlights() {
        return flights;
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable int id) {
        return flights.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}