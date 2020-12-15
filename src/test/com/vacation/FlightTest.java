package test.com.vacation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.Flight;


public class FlightTest {

private Flight classUnderTest;
	
	
	@BeforeEach
	public void setup() {
		classUnderTest = new Flight();
	}
	
	@Test
	public void settersGettersTest() {
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
		classUnderTest.setCost_per_Passenger((double) 90);
		classUnderTest.setOrigin(origin);
		classUnderTest.setDestination(destination);
		classUnderTest.setDeparture(new Date());
		classUnderTest.setEstimated_arrival(new Date());
		
		assertEquals((double) 90, (double) classUnderTest.getCost_per_Passenger(), 0.001);
		assertEquals(new Date().getYear(), classUnderTest.getDeparture().getYear());
		assertEquals(new Date().getMonth(), classUnderTest.getDeparture().getMonth());
		assertEquals(new Date().getDay(), classUnderTest.getDeparture().getDay());
		
		assertEquals(new Date().getYear(), classUnderTest.getEstimated_arrival().getYear());
		assertEquals(new Date().getMonth(), classUnderTest.getEstimated_arrival().getMonth());
		assertEquals(new Date().getDay(), classUnderTest.getEstimated_arrival().getDay());

		assertEquals(origin, classUnderTest.getOrigin());
		assertEquals(destination, classUnderTest.getDestination());

		assertNotNull(classUnderTest.getCost_per_Passenger());
		assertNotNull(classUnderTest.getDeparture());
		assertNotNull(classUnderTest.getEstimated_arrival());
		assertNotNull(classUnderTest.getOrigin());
		assertNotNull(classUnderTest.getDestination());
	}
	
	@Test
	public void settersGettersTest_BlankValues() {
		Airport origin = new Airport();
		Airport destination = new Airport();
		
		classUnderTest.setCost_per_Passenger((double) 0);
		classUnderTest.setOrigin(origin);
		classUnderTest.setDestination(destination);
		classUnderTest.setDeparture(new Date());
		classUnderTest.setEstimated_arrival(new Date());
		
		assertEquals((double) 0, (double) classUnderTest.getCost_per_Passenger(), 0.001);
		assertEquals(new Date().getYear(), classUnderTest.getDeparture().getYear());
		assertEquals(new Date().getMonth(), classUnderTest.getDeparture().getMonth());
		assertEquals(new Date().getDay(), classUnderTest.getDeparture().getDay());
		
		assertEquals(new Date().getYear(), classUnderTest.getEstimated_arrival().getYear());
		assertEquals(new Date().getMonth(), classUnderTest.getEstimated_arrival().getMonth());
		assertEquals(new Date().getDay(), classUnderTest.getEstimated_arrival().getDay());

		assertEquals(origin, classUnderTest.getOrigin());
		assertEquals(destination, classUnderTest.getDestination());

	}
	
	@Test
	public void settersGettersTest_Null() {
		assertNull(classUnderTest.getCost_per_Passenger());
		assertNull(classUnderTest.getDeparture());
		assertNull(classUnderTest.getEstimated_arrival());
		assertNull(classUnderTest.getOrigin());
		assertNull(classUnderTest.getDestination());
	}
}
