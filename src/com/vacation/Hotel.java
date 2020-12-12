package com.vacation;

public class Hotel {
	private enum State {
		NC,
		AL,
		SC
	}
	private String name;
	private String city;
	private State state;
	private Double nightly_cost;
	
	public Hotel(String name, String city, State state, Double nightly_cost) {
		this.setName(name);
		this.setCity(city);
		this.setState(state);
		this.setNightly_cost(nightly_cost);
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
	public Double getNightly_cost() {
		return nightly_cost;
	}
	public void setNightly_cost(Double nightly_cost) {
		this.nightly_cost = nightly_cost;
	}
	
	
}
