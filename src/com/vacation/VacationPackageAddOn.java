/**
 * 
 */
package com.vacation;

/**
 * @author Virupax
 *
 */
public class VacationPackageAddOn implements IVacationPackage {

	private IVacationPackage vacation_package;
	private IReservation reservation;
	
	
	public VacationPackageAddOn(IVacationPackage vacation_package, IReservation reservation) {}

	
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
