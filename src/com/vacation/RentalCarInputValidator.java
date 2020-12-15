package com.vacation;

import java.util.Date;

public class RentalCarInputValidator {

	private static RentalCarInputValidator insatnce;

	private RentalCarInputValidator() {}
	
	public static RentalCarInputValidator getInsatnce() {
		return insatnce;
	}
	
	public Boolean validateInitialInput(Date pick_up, Date drop_off, RoundTripFlightReservation flight_res) {
		Boolean isValid = Boolean.TRUE;
		
		
		return isValid;
	}
	
	public Boolean validateCarRentalChoice(CarRental car_rental, RoundTripFlightReservation flight_res) {
		Boolean isValid = Boolean.TRUE;
		
		
		return isValid;
		
	}
}
