package test.com.vacation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.Flight;
import com.vacation.Itinerary;
import com.vacation.RoundTripFlightReservation;

public class RoundTripFlightReservationTest {
private RoundTripFlightReservation classUnderTest;
	
	@BeforeEach
	public void setup() {
		classUnderTest = new RoundTripFlightReservation();
		
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
		return_flight.setOrigin(origin);
		return_flight.setDestination(destination);
		return_flight.setDeparture(new Date());
		return_flight.setEstimated_arrival(new Date());
		List<Flight> return_flight_legs = new ArrayList<Flight>();
		return_flight_legs.add(return_flight);
		
		
		onward_journey = new Itinerary(onward_flight_legs);
		return_journey = new Itinerary(return_flight_legs);

		classUnderTest = new RoundTripFlightReservation(2, 2, onward_journey, return_journey);
		
		assertEquals(380, classUnderTest.getCost(), 0.01);
		assertEquals(2, classUnderTest.getNum_adults(), 0);
		assertEquals(2, classUnderTest.getNum_children(), 0);
		assertEquals(onward_journey, classUnderTest.getOnward_journey());
		assertEquals(return_journey, classUnderTest.getReturn_journey());
		assertEquals("Cost for 2 adults and 2 children is:380.0", classUnderTest.getDescription());

		assertNotNull(classUnderTest.getCost());
		assertNotNull(classUnderTest.getNum_adults());
		assertNotNull(classUnderTest.getNum_children());
		assertNotNull(classUnderTest.getOnward_journey());
		assertNotNull(classUnderTest.getReturn_journey());
	}
	
	
	@Test
	public void settersGettersTest_NullValues() {
		assertNull(classUnderTest.getCost());
		assertNull(classUnderTest.getNum_adults());
		assertNull(classUnderTest.getNum_children());
		assertNull(classUnderTest.getOnward_journey());
		assertNull(classUnderTest.getReturn_journey());
	}
}
