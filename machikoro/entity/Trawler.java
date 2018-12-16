package com.company.machikoro.entity;



public class Trawler extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Trawler (Player owner)
    {
        this.name="Траулер";
        this.triggers = new byte[] {12,13,14};
        this.owner = owner;
        this.cardid = c_trawler;
        this.cost = 5;
        this.symbol = c_boat;
    }
    public Boolean Condition()
    {
        return (super.Condition() & this.owner.port);
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(this.owner.game.trawler);
    }

}