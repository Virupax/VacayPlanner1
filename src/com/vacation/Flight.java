package com.vacation;

import java.util.Date;

public class Flight {

	private String flight_num;
	private Airport origin;
	private Airport destination;
	private Date departure;
	private Date estimated_arrival;
	private Double cost_per_Passenger;
	
	public Flight(String flight_num, Airport origin, Airport destination, Date departure, Date estimated_arrival, Double cost_per_Passenger) {
		this.setFlight_num(flight_num);
		this.setOrigin(origin);
		this.setDestination(destination);
		this.setDeparture(departure);
		this.setEstimated_arrival(estimated_arrival);
		this.setCost_per_Passenger(cost_per_Passenger);
	}
	
	public Flight() {}
	
	public String getFlight_num() {
		return flight_num;
	}
	public void setFlight_num(String flight_num) {
		this.flight_num = flight_num;
	}
	public Airport getOrigin() {
		return origin;
	}
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getEstimated_arrival() {
		return estimated_arrival;
	}
	public void setEstimated_arrival(Date estimated_arrival) {
		this.estimated_arrival = estimated_arrival;
	}
	public Double getCost_per_Passenger() {
		return cost_per_Passenger;
	}
	public void setCost_per_Passenger(Double cost_per_Passenger) {
		this.cost_per_Passenger = cost_per_Passenger;
	}
	
	
}
