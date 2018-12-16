package com.company.machikoro.entity;



public class Pizzeria extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    Pizzeria (Player owner)
    {
        this.name="Пиццерия";
        this.triggers = new byte[] {7};
        this.owner = owner;
        this.cardid = c_pizzeria;
        this.cost = 1;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        this.owner.steal(1+this.owner.TradeBonus(),this.owner.game.currentPlayer);
    }
}