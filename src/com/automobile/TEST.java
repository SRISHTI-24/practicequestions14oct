package com.automobile;

import com.automobile.Twowheeler.Hero;
import com.automobile.Twowheeler.Honda;

public class TEST {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.getModelname();
        h.getregistrationNumber();
        h.getownername();
        System.out.println(h.getspeed());
        h.radio();
        Honda h1 = new Honda();
        h1.getModelname();
        h1.getregistrationNumber();
        h1.getownername();
        System.out.println(h1.getspeed());
        h1.cdplayer();
    }

}
