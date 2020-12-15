package com.vacation;

import java.util.List;


public class Itinerary {
	
	private enum Direction {
		To,
		From
	};
	private List<Flight> flight_legs;
	private Integer direction;
	
	public Itinerary(List<Flight> flight_legs) {
		this.setFlight_legs(flight_legs);
	}
	
	public Itinerary() {}

	public List<Flight> getFlight_legs() {
		return flight_legs;
	}

	public void setFlight_legs(List<Flight> flight_legs) {
		this.flight_legs = flight_legs;
	}

	public String getDirection() {		
		if(direction != null) {
			return Direction.values()[direction].toString();			
		}else {
			return null;
		}
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	
}
