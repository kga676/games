package com.company.machikoro.entity;



public class Flowers extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Flowers (Player owner)
    {
        this.name="Цветник";
        this.triggers = new byte[] {4};
        this.owner = owner;
        this.cardid = c_flowers;
        this.cost = 2;
        this.symbol = c_seed;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(1);
    }

}