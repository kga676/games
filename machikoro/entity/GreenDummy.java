package com.company.machikoro.entity;



public class GreenDummy extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    GreenDummy (Player owner)
    {
        this.name="";
        this.triggers = new byte[] {};
        this.owner = owner;
        this.cardid = 0;
        this.cost = 0;
        this.symbol = 0;
    }
    public void effect()
    {
        super.effect();

    }
}