package test.com.vacation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.BaseVacationPackage;
import com.vacation.Flight;
import com.vacation.Itinerary;
import com.vacation.RoundTripFlightReservation;

public class BaseVacationPackageTest {
private BaseVacationPackage classUnderTest;
	
	@BeforeEach
	public void setup() {
		classUnderTest = new BaseVacationPackage();

	}
	
	@Test
	public void settersGettersTest() {
		Itinerary onward_journey;
		Itinerary return_journey;

		
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
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
		onward_journey.setDirection(0);
		return_journey = new Itinerary(return_flight_legs);
		return_journey.setDirection(1);
		
		RoundTripFlightReservation roundTripFlightReservation = new RoundTripFlightReservation(2, 2, onward_journey, return_journey);
		
		classUnderTest = new BaseVacationPackage(roundTripFlightReservation);
		
		assertEquals(roundTripFlightReservation, classUnderTest.getRound_trip_flight_res());
		assertEquals(380, classUnderTest.getCost(), 0);
		assertEquals("Total cost inlcuding tax is:408.5", classUnderTest.getDescription());
		
	}
	
	
	@Test
	public void settersGettersTest_NullValues() {
		assertNull(classUnderTest.getRound_trip_flight_res());
	}

	
	
}
