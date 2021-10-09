package com.theBestBikeShop;

public class MountainBike extends Bicycle{

    private final boolean frontSuspension;
    private final boolean rearSuspension;

    public MountainBike(int gear, int speed, boolean lightStatus, boolean frontSuspension, boolean rearSuspension) {
        super(gear, speed, lightStatus);

        this.frontSuspension = frontSuspension;
        this.rearSuspension = rearSuspension;
    }

    public boolean isFullSuspension(){

        return this.frontSuspension && this.rearSuspension;
    }

    @Override
    public void currentState(){
        System.out.println("Speed: " + super.getSpeed());
        System.out.println("Gear: " + super.getGear());
        System.out.println("Light Status: " + super.getLightStatus());
        System.out.println("Full Suspension: " + isFullSuspension());
    }
}
