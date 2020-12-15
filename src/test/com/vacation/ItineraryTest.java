package test.com.vacation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.Flight;
import com.vacation.Itinerary;

public class ItineraryTest {

	private Itinerary classUnderTest;
	
	@BeforeEach
	public void setup() {
		classUnderTest = new Itinerary();
	}
	
	@Test
	public void settersGettersTest() {		
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
		
		classUnderTest = new Itinerary(onward_flight_legs);
		classUnderTest.setDirection(0);
		
		assertEquals("To", classUnderTest.getDirection());
		assertEquals(onward_flight_legs, classUnderTest.getFlight_legs());	
	}
	
	@Test
	public void settersGettersTest_BlankValues() {
		assertNull(classUnderTest.getDirection());
		assertNull(classUnderTest.getFlight_legs());
	}
}
