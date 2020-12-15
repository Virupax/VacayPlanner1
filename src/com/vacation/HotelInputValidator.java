package com.vacation;

import java.util.Date;
import java.util.List;

public class HotelInputValidator {

	private static HotelInputValidator instance;

	private HotelInputValidator() {}
	
	public static HotelInputValidator getInstance() {
		return instance;
	}

	public Boolean validateInitialInput(Date check_in, Date check_out, Integer num_rooms, List<Integer> num_adults_in_rooms, List<Integer> num_children_in_rooms, RoundTripFlightReservation flight_res) {
		Boolean isValid = Boolean.TRUE;
		if(check_in == null || flight_res.getOnward_journey().getFlight_legs().get(0).getEstimated_arrival().before(check_in)) {
			isValid = Boolean.FALSE;		
		}

		if(check_out == null || flight_res.getReturn_journey().getFlight_legs().get(0).getDeparture().after(check_out)) {
			isValid = Boolean.FALSE;		
		}
		
		if(num_rooms < 1) {
			isValid = Boolean.FALSE;		
		}
		
		if(num_adults_in_rooms.size() <  num_rooms || num_children_in_rooms != null) {
			isValid = Boolean.FALSE;
			
			for( Integer num_adults_in_room : num_adults_in_rooms) {
				if(num_adults_in_room < 1 ) {					
					isValid = Boolean.FALSE;
				}
			}
		}
		
		

		return isValid;
	}
	
	public Boolean validateHotelChoice(Hotel hotel, RoundTripFlightReservation flight_res) {
		Boolean isValid = Boolean.TRUE;
		
		if(!hotel.getCity().equalsIgnoreCase(flight_res.getOnward_journey().getFlight_legs().get(0).getOrigin().getCity())) {
			isValid = Boolean.FALSE;
		}
				
		return isValid;		
	}
}
