package com.company.machikoro.entity;



public class Farm extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Farm (Player owner)
    {
        this.name="Ферма";
        this.triggers = new byte[] {2};
        this.owner = owner;
        this.cardid = c_farm;
        this.cost = 1;
        this.symbol = c_cow;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(1);
    }

}