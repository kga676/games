package com.company.machikoro.entity;



public class Bakery extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    Bakery (Player owner)
    {
        this.name="Пекарня";
        this.triggers = new byte[] {2,3};
        this.owner = owner;
        this.cardid = c_bakery;
        this.cost = 1;
        this.symbol = c_box;
    }
    public void effect()
    {
        super.effect();
        this.owner.addMoney(1+this.owner.TradeBonus());
    }
}