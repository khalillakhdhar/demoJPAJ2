package com.jpa.model.heritage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicule {
@Id
private int id;

private String manifacturer;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getManifacturer() {
	return manifacturer;
}

public void setManifacturer(String manifacturer) {
	this.manifacturer = manifacturer;
}





}
