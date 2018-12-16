package com.company.machikoro.entity;



public class Burgers extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    Burgers (Player owner)
    {
        this.name="Бургерная";
        this.triggers = new byte[] {8};
        this.owner = owner;
        this.cardid = с_burgers;
        this.cost = 1;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        this.owner.steal(1+this.owner.TradeBonus(),this.owner.game.currentPlayer);
    }
}