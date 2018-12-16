package com.company.machikoro.entity;



public class Boat extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Boat (Player owner)
    {
        this.name="Рыбацкий баркас";
        this.triggers = new byte[] {8};
        this.owner = owner;
        this.cardid = c_fisher;
        this.cost = 2;
        this.symbol = c_boat;
    }
    public Boolean Condition ()
    {
        return (super.Condition() & this.owner.port);
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(3);
    }

}