package com.jpa.model.heritage;

import jakarta.validation.constraints.Min;

public abstract class Passenger extends Vehicule {

	@Min(1)
	private int noOfPassenger;

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	
	
}
