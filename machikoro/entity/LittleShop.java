package com.company.machikoro.entity;



public class LittleShop extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    LittleShop (Player owner)
    {
        this.name="Универмаг";
        this.triggers = new byte[] {2};
        this.owner = owner;
        this.cardid = c_littleshop;
        this.cost = 0;
        this.symbol = c_box;
    }
    public Boolean Condition ()
    {
        return (super.Condition() & this.owner.BigCount()<2);
    }
    public void effect()
    {
        super.effect();
        this.owner.addMoney(2+this.owner.TradeBonus());

    }
}