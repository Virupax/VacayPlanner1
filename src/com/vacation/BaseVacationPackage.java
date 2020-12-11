/**
 * 
 */
package com.vacation;

/**
 * @author Virupax
 *
 */
public class BaseVacationPackage implements IVacationPackage {

	private RoundTripFlightReservation round_trip_flight_res;
	
	
	BaseVacationPackage(RoundTripFlightReservation round_trip_flight_res){
		
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return null;
	}

}
