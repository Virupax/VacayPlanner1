package com.vacation;

import java.util.List;

public class Itinerary {
	
	private enum Direction {
		To,
		From
	};
	private List<Flight> flight_legs;
	private Direction direction;
	
	public Itinerary(List<Flight> flight_legs) {}

	public List<Flight> getFlight_legs() {
		return flight_legs;
	}

	public void setFlight_legs(List<Flight> flight_legs) {
		this.flight_legs = flight_legs;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
}
