package com.practice.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {
		
	}

	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int getEnergy() {
		return energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("The gorillas energy is:" + energyLevel);
		return energyLevel;
	}
}
