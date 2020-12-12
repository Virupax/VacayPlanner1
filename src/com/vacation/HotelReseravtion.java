package com.vacation;

import java.util.Date;
import java.util.Map;

public class HotelReseravtion implements IReservation {

	private Date check_in_date;
	private Date check_out_date;
	private Integer num_rooms;
	private Map<Integer, Integer> num_adults_in_rooms;
	private Map<Integer, Integer> num_children_in_rooms;
	private Double cost;
	private Hotel hotel;
	
	
	
	public HotelReseravtion(Date check_in_date, Date check_out_date, Integer num_rooms,
			Map<Integer, Integer> num_adults_in_rooms, Map<Integer, Integer> num_children_in_rooms, Double cost,
			Hotel hotel) {
		super();
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.num_rooms = num_rooms;
		this.num_adults_in_rooms = num_adults_in_rooms;
		this.num_children_in_rooms = num_children_in_rooms;
		this.cost = cost;
		this.hotel = hotel;
	}

	public Date getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(Date check_in_date) {
		this.check_in_date = check_in_date;
	}

	public Date getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(Date check_out_date) {
		this.check_out_date = check_out_date;
	}

	public Integer getNum_rooms() {
		return num_rooms;
	}

	public void setNum_rooms(Integer num_rooms) {
		this.num_rooms = num_rooms;
	}

	public Map<Integer, Integer> getNum_adults_in_rooms() {
		return num_adults_in_rooms;
	}

	public void setNum_adults_in_rooms(Map<Integer, Integer> num_adults_in_rooms) {
		this.num_adults_in_rooms = num_adults_in_rooms;
	}

	public Map<Integer, Integer> getNum_children_in_rooms() {
		return num_children_in_rooms;
	}

	public void setNum_children_in_rooms(Map<Integer, Integer> num_children_in_rooms) {
		this.num_children_in_rooms = num_children_in_rooms;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void setCost(Double cost) {
		this.cost = cost;
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
