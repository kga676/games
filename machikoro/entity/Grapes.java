package com.company.machikoro.entity;



public class Grapes extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Grapes (Player owner)
    {
        this.name="Виноградник";
        this.triggers = new byte[] {7};
        this.owner = owner;
        this.cardid = c_grapes;
        this.cost = 3;
        this.symbol = c_seed;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(3);
    }

}