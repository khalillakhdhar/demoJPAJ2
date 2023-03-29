package com.jpa.model.heritage;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Transportation extends Vehicule {
	@Column(nullable = false)
	private int loadCapacity;

}
