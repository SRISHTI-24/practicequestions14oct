package com.automobile.Twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelname() {
        System.out.println("model no 1");
        return "no2";
    }

    public String getregistrationNumber() {
        System.out.println("registration no = 7897ghy");
        return "201821-qs";
    }

    public String getownername() {
        System.out.println("owner name = xyzw");
        return "xyzw";
    }

    public int getspeed() {
        System.out.println("speed=");
        return 54;
    }

    public void cdplayer() {
        System.out.println("provides facility to control the cd player device which is available in the car");
    }
}
