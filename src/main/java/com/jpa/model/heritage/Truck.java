package com.jpa.model.heritage;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Transportation {

	private int noOfContainers;

	public int getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(int noOfContainers) {
		this.noOfContainers = noOfContainers;
	}
	
}
