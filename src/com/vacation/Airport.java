package com.vacation;

public class Airport {
	private enum State {
		NC,
		AL,
		NV,
		CA,
		NY
	}

	private String code;
	private String city;
	private Integer state;
	
	public Airport(String code, String city, Integer state) {
		this.setCity(city);
		this.setCode(code);
		this.setState(state);
	}
	
	public Airport() {
		// TODO Auto-generated constructor stub

	}

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
	public String getState() {
		if(state != null) {
			return State.values()[state].toString();			
		}else {
			return null;
		}
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}
