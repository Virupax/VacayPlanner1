package com.vacation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVacationPackage iVacationPackage;
		IReservation iReservation;
		
		RoundTripFlightReservation roundTripFlightReservation = new RoundTripFlightReservation();
		
		Itinerary onward_journey;
		Itinerary return_journey;

		
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("SF", "San Francisco", 4);
		
		Flight onward_flight = new Flight();
		onward_flight.setCost_per_Passenger((double) 90);
		onward_flight.setOrigin(origin);
		onward_flight.setDestination(destination);
		onward_flight.setDeparture(new Date());
		onward_flight.setEstimated_arrival(new Date());
		List<Flight> onward_flight_legs = new ArrayList<Flight>();
		onward_flight_legs.add(onward_flight);
		
		Flight return_flight = new Flight();
		return_flight.setCost_per_Passenger((double) 100);
		return_flight.setOrigin(destination);
		return_flight.setDestination(origin);
		return_flight.setDeparture(new Date());
		return_flight.setEstimated_arrival(new Date());
		List<Flight> return_flight_legs = new ArrayList<Flight>();
		return_flight_legs.add(return_flight);
		
		
		onward_journey = new Itinerary(onward_flight_legs);
		return_journey = new Itinerary(return_flight_legs);

		roundTripFlightReservation = new RoundTripFlightReservation(2, 2, onward_journey, return_journey);

	}

}
