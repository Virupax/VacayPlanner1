package com.vacation;


public class CarRental {
	private enum State {
		NC,
		AL,
		SC
	}
	private String name;
	private String city;
	private State state;
	private Double daily_cost;
		
	
	public CarRental(String name, String city, State state, Double daily_cost) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.daily_cost = daily_cost;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Double getDaily_cost() {
		return daily_cost;
	}
	public void setDaily_cost(Double daily_cost) {
		this.daily_cost = daily_cost;
	}
	
	
		
}
