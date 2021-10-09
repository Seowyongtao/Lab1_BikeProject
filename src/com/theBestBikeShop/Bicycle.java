package com.theBestBikeShop;

public class Bicycle {
	private int gear;
	private int speed;
	private boolean lightStatus;

	public Bicycle(int gear, int speed, boolean lightStatus){
		this.gear = gear;
		this.speed = speed;
		this.lightStatus = lightStatus;
	}

	public void applyBrake(int decrement) {
		speed-=decrement;
	}

	public void speedUp(int increment) {
		speed+=increment;
	}

	public void switchLight(){
		this.lightStatus = !this.lightStatus;
	}

	public int getSpeed(){
		return this.speed;
	}

	public int getGear(){
		return this.gear;
	}

	public void setGear(int newValue) {
		gear=newValue;
	}

	public boolean getLightStatus(){
		return this.lightStatus;
	}

	public void currentState(){
		System.out.println("Speed: " + this.speed);
		System.out.println("Gear: " + this.gear);
		System.out.println("Light Status: " + this.lightStatus);
	}
}
