package com.vacation;

public class Airport {
	private enum State {
		NC,
		AL,
		NV
	}

	private String code;
	private String city;
	private State state;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	
	
}
