package com.company.machikoro.entity;



public class BigShop extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    BigShop (Player owner)
    {
        this.name="Супермаркет";
        this.triggers = new byte[] {4};
        this.owner = owner;
        this.cardid = c_bigshop;
        this.cost = 2;
        this.symbol = c_box;
    }
    public void effect()
    {
        super.effect();
        this.owner.addMoney(3+this.owner.TradeBonus());

    }
}