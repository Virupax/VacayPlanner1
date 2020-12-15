/**
 * 
 */
package com.vacation;

/**
 * @author Virupax
 *
 */
public class BaseVacationPackage implements IVacationPackage {

	public static final Double STATETAXFORFLIGHT = 0.075;
	
	private RoundTripFlightReservation round_trip_flight_res;
	
	
	public BaseVacationPackage(RoundTripFlightReservation round_trip_flight_res){
		this.setRound_trip_flight_res(round_trip_flight_res);
	}
	
	public BaseVacationPackage(){
	}
	
	
	public RoundTripFlightReservation getRound_trip_flight_res() {
		return round_trip_flight_res;
	}


	public void setRound_trip_flight_res(RoundTripFlightReservation round_trip_flight_res) {
		this.round_trip_flight_res = round_trip_flight_res;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Total cost inlcuding tax is:" + (this.getCost() + this.getCost() * STATETAXFORFLIGHT);
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return round_trip_flight_res.getCost();
	}

}
