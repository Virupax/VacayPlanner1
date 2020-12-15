package test.com.vacation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vacation.Airport;
import com.vacation.Flight;

public class AirportTest {

	private Airport classUnderTest;
	
	@BeforeEach
	public void setup() {
		classUnderTest = new Airport();
	}
	
	@Test
	public void settersGettersTest() {
		classUnderTest.setCity("Charlotte");
		classUnderTest.setCode("CLT");
		classUnderTest.setState(0);
		
		assertEquals("NC",classUnderTest.getState());
		assertEquals("CLT",classUnderTest.getCode());
		assertEquals("Charlotte",classUnderTest.getCity());
		
		assertNotNull(classUnderTest.getCode());
		assertNotNull(classUnderTest.getCity());
		assertNotNull(classUnderTest.getState());
		
	}
	
	@Test
	public void settersGettersTest_BlankValues() {
		classUnderTest.setCity("");
		classUnderTest.setCode("");
		classUnderTest.setState(0);
		
		assertEquals("NC",classUnderTest.getState());
		assertEquals("",classUnderTest.getCode());
		assertEquals("",classUnderTest.getCity());
	}
	
	@Test
	public void settersGettersTest_NullValues() {
		assertNull(classUnderTest.getState());
		assertNull(classUnderTest.getCode());
		assertNull(classUnderTest.getCity());
	}
	
}
