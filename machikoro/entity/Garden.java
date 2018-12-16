package com.company.machikoro.entity;



public class Garden extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Garden (Player owner)
    {
        this.name="Яблоневый сад";
        this.triggers = new byte[] {10};
        this.owner = owner;
        this.cardid = c_garden;
        this.cost = 3;
        this.symbol = c_seed;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(3);
    }

}