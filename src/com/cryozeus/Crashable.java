package com.cryozeus;


//This is an example of an Abstract Class :
public abstract class Crashable {
    boolean carDrivable = true;
    public void youCrashed() {
        this.carDrivable  = false;
    }
    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();
}
