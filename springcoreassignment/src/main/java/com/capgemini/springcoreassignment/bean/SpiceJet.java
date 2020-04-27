package com.capgemini.springcoreassignment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SpiceJet {
	private String name;
	@Autowired
	@Qualifier("getAirasia")
	private Aeroplane aeroplane;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aeroplane getAeroplane() {
		return aeroplane;
	}

	public void setAeroplane(Aeroplane aeroplane) {
		this.aeroplane = aeroplane;
	}

	public SpiceJet() {
		System.out.println("default");
	}
	
	public SpiceJet(String name, Aeroplane aeroplane) {
		this.name=name;
		this.aeroplane=aeroplane;
	}
	
	public void flyfaster() {
		System.out.println("Name of the Aeroplane--" +name);
		aeroplane.fly();
	}
}
