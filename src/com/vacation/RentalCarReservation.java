package com.vacation;

import java.util.Date;

public class RentalCarReservation implements IReservation {

	private Date pick_up_date_time;
	private Date pick_off_date_time;
	private Double cost;
	private CarRental car_rental;
	
	
	
	public Date getPick_up_date_time() {
		return pick_up_date_time;
	}

	public void setPick_up_date_time(Date pick_up_date_time) {
		this.pick_up_date_time = pick_up_date_time;
	}

	public Date getPick_off_date_time() {
		return pick_off_date_time;
	}

	public void setPick_off_date_time(Date pick_off_date_time) {
		this.pick_off_date_time = pick_off_date_time;
	}

	public CarRental getCar_rental() {
		return car_rental;
	}

	public void setCar_rental(CarRental car_rental) {
		this.car_rental = car_rental;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Cost for " + this.getCar_rental().getName() + " is:" + this.getCost();
	}

	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
