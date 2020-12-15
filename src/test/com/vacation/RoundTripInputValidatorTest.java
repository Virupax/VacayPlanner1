package test.com.vacation;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.RoundTripInputValidator;

public class RoundTripInputValidatorTest {

private RoundTripInputValidator classUnderTest;
	
	@BeforeEach
	public void setup() {
		classUnderTest = RoundTripInputValidator.getInstance();
	}
	
	@Test
	public void passCase() {
		Boolean result = Boolean.TRUE;
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.setTime(new Date());
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);

		final Calendar twoDaysLater = Calendar.getInstance();
		twoDaysLater.setTime(new Date());
		twoDaysLater.add(Calendar.DAY_OF_YEAR, 3);


		result = classUnderTest.validate(origin,destination, tomorrow.getTime(), twoDaysLater.getTime(), 2, 2);
		assertEquals(Boolean.TRUE, result);
	}
	
	@Test
	public void sameOriginAndDestinationAirports() {
		Boolean result = Boolean.TRUE;
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("CLT", "Charlotte", 3);
		
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.setTime(new Date());
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);

		final Calendar twoDaysLater = Calendar.getInstance();
		twoDaysLater.setTime(new Date());
		twoDaysLater.add(Calendar.DAY_OF_YEAR, 3);


		result = classUnderTest.validate(origin,destination, tomorrow.getTime(), twoDaysLater.getTime(), 2, 2);
		assertEquals(Boolean.FALSE, result);
	}
	
	@Test
	public void departureDateIsPresentDate() {
		Boolean result = Boolean.TRUE;
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
		final Calendar twoDaysLater = Calendar.getInstance();
		twoDaysLater.setTime(new Date());
		twoDaysLater.add(Calendar.DAY_OF_YEAR, 3);


		result = classUnderTest.validate(origin,destination, new Date(), twoDaysLater.getTime(), 2, 2);
		assertEquals(Boolean.FALSE, result);
	}
	
	@Test
	public void returnDateIsBeforeFlightArrival() {
		Boolean result = Boolean.TRUE;
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.setTime(new Date());
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);

		final Calendar twoDaysBefore = Calendar.getInstance();
		twoDaysBefore.setTime(new Date());
		twoDaysBefore.add(Calendar.DAY_OF_YEAR, -2);



		result = classUnderTest.validate(origin,destination, tomorrow.getTime(), twoDaysBefore.getTime(), 2, 2);
		assertEquals(Boolean.FALSE, result);
	}

	@Test
	public void zeroAdults() {
		Boolean result = Boolean.TRUE;
		Airport origin = new Airport("CLT", "Charlotte", 3);
		Airport destination = new Airport("JFK", "New York", 5);
		
		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.setTime(new Date());
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);

		final Calendar twoDaysLater = Calendar.getInstance();
		twoDaysLater.setTime(new Date());
		twoDaysLater.add(Calendar.DAY_OF_YEAR, 3);


		result = classUnderTest.validate(origin,destination, tomorrow.getTime(), twoDaysLater.getTime(), 0, 2);
		assertEquals(Boolean.FALSE, result);
	}
}
