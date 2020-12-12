package com.vacation;

import java.util.Calendar;
import java.util.Date;

public class RoundTripInputValidator {
	private static RoundTripInputValidator instance;
	private RoundTripInputValidator() {}
	
	public static RoundTripInputValidator getInstance() {
		return instance;
	}
	
	public Boolean validate(Airport origin, Airport dest, Date departure_date, Date return_date, Integer adults, Integer children) {
		Boolean isValid = Boolean.TRUE;
		

		final Calendar tomorrow = Calendar.getInstance();
		tomorrow.setTime(new Date());
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);
		
		if((origin == null || dest == null) || (origin.getCode().contentEquals(dest.getCode()))) {
			isValid = Boolean.FALSE;
		}
		if(departure_date == null || departure_date.before(tomorrow.getTime()) ) {
			isValid = Boolean.FALSE;
		}
		
		if(return_date == null || return_date.before(departure_date)) {
			isValid = Boolean.FALSE;
		}
		
		if(adults == null || children == null || adults < 1) {
			isValid = Boolean.FALSE;			
		}

		
		return isValid;
	}
	
}
