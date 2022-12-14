package com.company;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(String make,double radius,String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //public void isOn(boolean isOn){
        //this.isOn = isOn;
    //}
    public void switchOn(){
        this.isOn = true;
        setSteed((byte)5);
    }
    public void switchOff(){
        this.isOn = false;
        setSteed((byte)0);
    }
    public void setSteed(byte speed){
    this.speed = speed;
    }
public String toString(){
        return String.format("make - %s,radius - %f, color - %s, isOn - %b, speed - %d",make,radius,color,isOn,speed);
    }

}
