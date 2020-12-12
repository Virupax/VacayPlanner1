package com.vacation;

public class RoundTripFlightReservation implements IReservation {

	private Integer num_adults;
	private Integer num_children;
	private Double cost;
	private Itinerary onward_journey;
	private Itinerary return_journey;
	
	public RoundTripFlightReservation(Integer num_adults, Integer num_children, Double cost, Itinerary onward_journey, Itinerary return_journey) {
		this.setNum_adults(num_adults);
		this.setNum_children(num_children);
		this.setCost(cost);
		this.setOnward_journey(onward_journey);
		this.setReturn_journey(return_journey);
	}
	
	public Integer getNum_adults() {
		return num_adults;
	}
	public void setNum_adults(Integer num_adults) {
		this.num_adults = num_adults;
	}
	public Integer getNum_children() {
		return num_children;
	}
	public void setNum_children(Integer num_children) {
		this.num_children = num_children;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Itinerary getOnward_journey() {
		return onward_journey;
	}
	public void setOnward_journey(Itinerary onward_journey) {
		this.onward_journey = onward_journey;
	}
	public Itinerary getReturn_journey() {
		return return_journey;
	}
	public void setReturn_journey(Itinerary return_journey) {
		this.return_journey = return_journey;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
