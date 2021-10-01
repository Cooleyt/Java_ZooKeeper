package com.practice.zookeeper;

public class Gorilla extends Mammal {
	public void throwItem() {
		this.setEnergy(this.getEnergy()-5);
		System.out.println("The gorilla threw something at you! You lose energy :(");
	}
	
	public void eatBananas() {
		this.setEnergy(this.getEnergy()+10);
		System.out.println("The gorilla is eating a banana! Yum! You gain energy :)");
	}
	
	public void climb() {
		this.setEnergy(getEnergy()-10);
		System.out.println("The gorilla is climbing things! You lose energy :(");
	}

}
