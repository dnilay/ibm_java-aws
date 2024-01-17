package com.ibm.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Guiter {

	private String serialNumber;
	private double price;
	private String builder;
	private String model;
	private GuiterType type;
	private String backWood;
	private String topWood;

	@Override
	public boolean equals(Object obj) {
		Guiter tempGuiter = null;
		if (obj instanceof Guiter) {
			tempGuiter = (Guiter) obj;
		}
		if (this.getSerialNumber().equals(tempGuiter.getSerialNumber())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Guiter [serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model=" + model
				+ ", type=" + type.getType() + ", backWood=" + backWood + ", topWood=" + topWood + "]";
	}

	public Guiter(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

}
