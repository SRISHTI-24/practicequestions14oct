package com.automobile.Twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle
{
    public String getModelname()
    {
        System.out.println("model no 1");
       return "no1";
    }
    public String getregistrationNumber()
    {
        System.out.println("registration no = 2027skq");
        return "201821-sq";
    }
    public String getownername()
    {
        System.out.println("owner name = abcd");
        return "abcd";
    }
    public int getspeed()
    {
        System.out.println("speed=");
        return 24;
    }
    public void radio()
    {
        System.out.println("provides facility to control the radio device");
    }
}

